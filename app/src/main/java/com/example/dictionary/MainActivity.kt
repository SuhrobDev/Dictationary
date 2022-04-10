package com.example.dictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionary.Model.Model
import com.example.dictionary.adapter.WordAdapter
import com.example.dictionary.database.Database
import com.example.dictionary.databinding.ActivityMainBinding
import com.example.dictionary.libs.DataBaseHelper

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var data: Model
    private val adapter by lazy {
        WordAdapter()
    }
    var pressFavourite = false
    var press = false
    var favourite = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        title = ""
        adapter.addAllWords(Database.getDatabase().words)
        if (intent.getIntExtra("ID", 0) == 1) {
            favourite = 1
            adapter.addAllWords(Database.getDatabase().getWords(1))
        } else if (intent.getIntExtra("ID", 0) == 2) {
            favourite = 2
            adapter.addAllWords(Database.getDatabase().getWords(2))
        }

        binding.list.layoutManager = LinearLayoutManager(this)
        binding.list.adapter = adapter

        binding.change.setOnClickListener {
            if (!press) {
                favourite = 1
                press = true
                adapter.addAllWords(Database.getDatabase().getWords(1))
            } else {
                favourite = 2
                press = false
                adapter.addAllWords(Database.getDatabase().getWords(2))
            }
        }

        adapter.setClickFavouriteImage {
            if (adapter.data[it].favourite == 0){
                adapter.data[it].favourite = 1
                Database.getDatabase().editFavourite(Model(1), adapter.data[it].id)
                Toast.makeText(this, "Favorite", Toast.LENGTH_SHORT).show()

            }else if (adapter.data[it].favourite == 1){
                adapter.data[it].favourite = 0
                Database.getDatabase().editFavourite(Model(0), adapter.data[it].id)
                Toast.makeText(this, "Removed", Toast.LENGTH_SHORT).show()
            }
            adapter.notifyItemChanged(it)
        }
        binding.fevBtn.setOnClickListener {
            if (!pressFavourite) {
                pressFavourite = true
                adapter.addAllWords(Database.getDatabase().sortFavourite(1))
            } else {
                pressFavourite = false
                adapter.addAllWords(Database.getDatabase().words)
            }
        }

        binding.search.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if (pressFavourite) {
                    adapter.addAllWords(Database.getDatabase().searchFavourite(p0,favourite,1))
                } else {
                    adapter.addAllWords(Database.getDatabase().search(p0,favourite))
                }
                return true
            }
        })
    }
}
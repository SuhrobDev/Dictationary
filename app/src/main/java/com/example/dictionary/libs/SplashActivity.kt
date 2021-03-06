package com.example.dictionary.libs

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.dictionary.MainActivity
import com.example.dictionary.R


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    val shared by lazy {
        SharedPreferencesHelper(this)
    }
    lateinit var progressText: TextView
    var maxProgress = 100
    private var progressStatus = 0
    lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar : ActionBar? = supportActionBar
        actionBar?.hide()
        setContentView(R.layout.splash_activity)
        //startTimer()
        progressText = findViewById(R.id.progressText)
        progressBar = findViewById(R.id.progressBar)
        progress()
    }
    @SuppressLint("SetTextI18n")
    private fun progress() {
        val thread = Thread{
            while (!allCheck()){
                count()
                runOnUiThread {
                    progressBar.max = maxProgress
                    progressBar.progress = progressStatus
                    progressText.text = "$progressStatus %"
                }
                if (allCheck()){
                    finish()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        thread.start()
    }

    private fun allCheck(): Boolean {
        if (progressStatus == maxProgress){
            return true
        }
        return false
    }

    private fun count() {
        progressStatus+=1
        Thread.sleep(25)
    }

//    private fun startTimer() {
//
//        object : CountDownTimer(3000, 1000) {
//            override fun onFinish() {
//                shared.loadLocale(this@SplashActivity)
//                finish()
//                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
//            }
//
//            override fun onTick(millisUntilFinished: Long) {
//
//            }
//
//        }.start()
//    }
}
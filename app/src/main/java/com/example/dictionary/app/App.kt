package com.example.dictionary.app

import android.app.Application
import com.example.dictionary.database.Database

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Database.init(this).createDatabase().open()
    }

    override fun onTerminate() {
        Database.getDatabase().close()
        super.onTerminate()
    }
}
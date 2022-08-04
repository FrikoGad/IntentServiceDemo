package com.example.intentservicedemo

import android.app.IntentService
import android.content.Intent
import android.util.Log
import java.util.concurrent.TimeUnit

class MyIntentService(name: String = "IntentService") : IntentService(name) {
    override fun onHandleIntent(intent: Intent?) {
        val time = intent?.getIntExtra("time", 0)!!.toLong()
        val label = intent.getStringExtra("label") as String
        Log.d("myLog", label)
        try {
            TimeUnit.SECONDS.sleep(time)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        Log.d("myLog", label)
    }
}
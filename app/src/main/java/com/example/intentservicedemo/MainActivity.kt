package com.example.intentservicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentservicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartIntentService.setOnClickListener {
            val intent = Intent(this, MyIntentService::class.java)
            startService(intent.putExtra("time", 2)
                .putExtra("label", "First task"))
            startService(intent.putExtra("time", 4)
                .putExtra("label", "Second task"))
            startService(intent.putExtra("time", 6)
                .putExtra("label", "Third task"))
        }
    }
}
package com.uoksuz.androidexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.uoksuz.androidexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val newIntent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(newIntent)
        }
        Log.i("ALC","onCreate çalıştı")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ALC","onStart çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ALC","onResume çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ALC","onPause çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ALC","onStop çalıştı")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ALC","onRestart çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ALC","onDestroy çalıştı")
    }
}





package com.example.mytodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytodolist.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)
    }
}
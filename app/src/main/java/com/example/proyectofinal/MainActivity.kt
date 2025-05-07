package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botones
        binding.btnAr.setOnClickListener {
            startActivity(Intent(this, ARActivity::class.java))
        }
        binding.btnWhisper.setOnClickListener {
            startActivity(Intent(this, WhisperActivity::class.java))
        }
        binding.btnTts.setOnClickListener {
            startActivity(Intent(this, TTSActivity::class.java))
        }
    }
}
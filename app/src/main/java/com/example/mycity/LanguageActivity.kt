package com.example.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityLanguageBinding

class LanguageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLanguageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        binding= ActivityLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.russian.setOnClickListener {
            startActivity(Intent(this,MainMenuActivity::class.java))}
        }

    }
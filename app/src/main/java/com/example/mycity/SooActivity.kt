package com.example.mycity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityMainMenuBinding
import com.example.mycity.databinding.ActivitySooBinding

class SooActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySooBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soo)

        binding= ActivitySooBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView4.setOnClickListener {
            startActivity(Intent(this,MainMenuActivity::class.java))}

    }
}
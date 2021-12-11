package com.example.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityAppealBinding
import com.example.mycity.databinding.ActivityMainMenuBinding

class AppealActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAppealBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appeal)

        binding= ActivityAppealBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView8.setOnClickListener {
            startActivity(Intent(this,MainMenuActivity::class.java))}
    }
}
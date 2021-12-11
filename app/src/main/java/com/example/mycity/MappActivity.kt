package com.example.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityMainMenuBinding
import com.example.mycity.databinding.ActivityMappBinding

class MappActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMappBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapp)

        binding= ActivityMappBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this,SooActivity::class.java))}

    }
}
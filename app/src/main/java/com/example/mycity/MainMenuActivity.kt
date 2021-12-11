package com.example.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        binding= ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.soo.setOnClickListener {
            startActivity(Intent(this,SooActivity::class.java))}

        binding.mapp.setOnClickListener {
            startActivity(Intent(this,MappActivity::class.java))}

        binding.contact.setOnClickListener {
            startActivity(Intent(this,ContactActivity::class.java))}

        binding.appeal.setOnClickListener {
            startActivity(Intent(this,AppealActivity::class.java))}

        binding.camera.setOnClickListener {
            startActivity(Intent(this,CameraActivity::class.java))}

    }
}
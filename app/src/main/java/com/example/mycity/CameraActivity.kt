package com.example.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityCameraBinding
import com.example.mycity.databinding.ActivityMainMenuBinding

class CameraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCameraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)


        binding= ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView3.setOnClickListener {
            startActivity(Intent(this,SooActivity::class.java))}




    }
}
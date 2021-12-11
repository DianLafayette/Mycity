package com.example.mycity

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycity.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        binding=ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.intro.setOnClickListener {
            startActivity(Intent(this,LanguageActivity::class.java))}

    }
}
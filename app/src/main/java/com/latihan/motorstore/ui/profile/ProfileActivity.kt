package com.latihan.motorstore.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import com.latihan.motorstore.R
import com.latihan.motorstore.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.imgProfile.load(R.drawable.kim) {
            crossfade(true)
            crossfade(2000)
            transformations(CircleCropTransformation())
        }

        binding.icBack.setOnClickListener { finish() }

    }
}
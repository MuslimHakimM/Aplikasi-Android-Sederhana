package com.latihan.motorstore.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.RoundedCornersTransformation
import com.latihan.motorstore.data.MotorData
import com.latihan.motorstore.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity() {

    companion object{
        const val EXTRA_DETAIL = "extra detail"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val motorData = intent.getParcelableExtra<MotorData>(EXTRA_DETAIL)

        binding.tvName.text = motorData?.name
        binding.tvPrice.text = motorData?.price
        binding.tvColor.text = motorData?.color
        binding.tvOverview.text = motorData?.overview
        binding.imgMotor.load(motorData?.image) {
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(10f))
        }

        binding.icBack.setOnClickListener { finish() }
    }
}
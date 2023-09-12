package com.latihan.motorstore.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.latihan.motorstore.adapter.MotorAdapter
import com.latihan.motorstore.data.MotorData
import com.latihan.motorstore.data.MotordDataDetail
import com.latihan.motorstore.databinding.ActivityHomeBinding
import com.latihan.motorstore.ui.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val motorAdapter = MotorAdapter(MotordDataDetail.getMotorDataDetail() as ArrayList<MotorData>)

        with(binding.rvMoto) {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            setHasFixedSize(true)
            adapter = motorAdapter
            motorAdapter.notifyDataSetChanged()
        }



        binding.icPerson.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
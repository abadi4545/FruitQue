package com.example.fruitque.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.CircleCropTransformation
import com.example.fruitque.R
import com.example.fruitque.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgPhoto.load(R.drawable.abadi) {
            crossfade(true)
            crossfade(2000)
            transformations(CircleCropTransformation())
        }

        binding.icBack.setOnClickListener { finish() }
    }
}
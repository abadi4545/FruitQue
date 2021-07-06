package com.example.fruitque.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.fruitque.Data.Fruit
import com.example.fruitque.R
import com.example.fruitque.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val motor = intent.getParcelableExtra<Fruit>(EXTRA_DETAIL)

        binding.tvName.text = motor?.name
        binding.tvPrice.text = motor?.price
        binding.tvOverview.text = motor?.overview
        binding.imgPoster.load(motor?.poster) {
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(10f))
        }

        binding.icBack.setOnClickListener { finish() }
    }
}
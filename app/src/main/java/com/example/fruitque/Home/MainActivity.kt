package com.example.fruitque.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitque.Adafter.FruitAdapter
import com.example.fruitque.Data.Fruit
import com.example.fruitque.Data.FruitData
import com.example.fruitque.Detail.DetailActivity
import com.example.fruitque.Profile.ProfileActivity
import com.example.fruitque.R
import com.example.fruitque.databinding.ActivityDetailBinding
import com.example.fruitque.databinding.ActivityMainBinding
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fruitAdapter = FruitAdapter(FruitData.getDataFruit() as ArrayList<Fruit>)

        with(binding.rvFruit){
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = fruitAdapter
            fruitAdapter.notifyDataSetChanged()
        }

        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(query: String?): Boolean {
                fruitAdapter.filter.filter(query)
                return false
            }

        })

        binding.icPerson.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

    }

}
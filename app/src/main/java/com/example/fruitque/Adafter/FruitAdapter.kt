package com.example.fruitque.Adafter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.fruitque.Data.Fruit
import com.example.fruitque.Detail.DetailActivity
import com.example.fruitque.databinding.ItemFruitBinding
import java.util.*
import kotlin.collections.ArrayList

class FruitAdapter(listFruit: ArrayList<Fruit>) : RecyclerView.Adapter<FruitAdapter.ViewHolder>(),
    Filterable {

    private val searchList = ArrayList<Fruit>(listFruit)
    private val mainList = listFruit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFruitBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mainList[position])
    }

    override fun getItemCount(): Int = mainList.size

    class ViewHolder(private val binding: ItemFruitBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(motor: Fruit) {
            binding.tvName.text = motor.name
            binding.tvPrice.text = motor.price
            binding.imgPoster.load(motor.poster) {
                crossfade(true)
                crossfade(1000)
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DETAIL, motor)
                }
                it.context.startActivity(intent)
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val filteredList = ArrayList<Fruit>()
                if (constraint.isBlank() or constraint.isEmpty()) {
                    filteredList.addAll(searchList)
                } else {
                    val filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim()

                    searchList.forEach {
                        if (it.name.toLowerCase(Locale.ROOT).contains(filterPattern)) {
                            filteredList.add(it)
                        }
                    }
                }
                val result = FilterResults()
                result.values = filteredList

                return result
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                mainList.clear()
                mainList.addAll(results?.values as List<Fruit>)
                notifyDataSetChanged()
            }
        }
    }
}
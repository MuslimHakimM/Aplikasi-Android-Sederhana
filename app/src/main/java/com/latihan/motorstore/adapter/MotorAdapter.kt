package com.latihan.motorstore.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.latihan.motorstore.data.MotorData
import com.latihan.motorstore.databinding.ItemMotorBinding
import com.latihan.motorstore.ui.detail.DetailActivity
import java.util.*
import kotlin.collections.ArrayList

class   MotorAdapter(listMotorData: ArrayList<MotorData>) : RecyclerView.Adapter<MotorAdapter.ViewHolder>(), Filterable {

    private val searchList = ArrayList<MotorData>(listMotorData)
    private val mainList = listMotorData

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemMotorBinding.inflate(
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

    class ViewHolder(private val binding: ItemMotorBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(motor: MotorData) {
            binding.tvName.text = motor.name
            binding.tvPrice.text = motor.price
            binding.tvColor.text = motor.color
            binding.tvEngine.text = motor.engine
            binding.tvRating.text = motor.star
            binding.imgMotor.load(motor.image) {
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
                val filteredList = ArrayList<MotorData>()
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
                mainList.addAll(results?.values as List<MotorData>)
                notifyDataSetChanged()
            }
        }
    }
}
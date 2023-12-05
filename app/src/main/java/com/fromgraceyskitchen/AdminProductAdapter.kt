package com.fromgraceyskitchen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fromgraceyskitchen.databinding.RvAdminProductBinding

class AdminProductAdapter(
    var productLists: List<AdminProductData>
) : RecyclerView.Adapter<AdminProductAdapter.AdminProductHolder>() {
    inner class AdminProductHolder(val binding: RvAdminProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminProductHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvAdminProductBinding.inflate(layoutInflater, parent, false)
        return AdminProductHolder(binding)
    }

    override fun getItemCount(): Int {
        return productLists.size
    }

    override fun onBindViewHolder(holder: AdminProductHolder, position: Int) {
        holder.binding.apply {
            tvProduct.text = productLists[position].product

        }
    }

    fun updateData(newData: List<AdminProductData>) {
        productLists = newData
        notifyDataSetChanged()
    }
}
package com.fromgraceyskitchen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fromgraceyskitchen.databinding.RvAdminInventoryBinding

class AdminInventoryAdapter(
    var inventoryLists: List<AdminInventoryData>
) : RecyclerView.Adapter<AdminInventoryAdapter.AdminInventoryHolder>() {
    inner class AdminInventoryHolder(val binding: RvAdminInventoryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminInventoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvAdminInventoryBinding.inflate(layoutInflater, parent, false)
        return AdminInventoryHolder(binding)
    }

    override fun getItemCount(): Int {
        return inventoryLists.size
    }

    override fun onBindViewHolder(holder: AdminInventoryHolder, position: Int) {
        holder.binding.apply {
            tvProduct.text = inventoryLists[position].product
            tvQuantityInStock.text = inventoryLists[position].quantityInStock.toString()

        }
    }

    fun updateData(newData: List<AdminInventoryData>) {
        inventoryLists = newData
        notifyDataSetChanged()
    }
}
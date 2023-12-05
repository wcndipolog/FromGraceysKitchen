package com.fromgraceyskitchen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fromgraceyskitchen.databinding.RvAdminCustomerBinding

class AdminCustomerAdapter(
    var customerLists: List<AdminCustomerData>
) : RecyclerView.Adapter<AdminCustomerAdapter.AdminCustomerHolder>() {
    inner class AdminCustomerHolder(val binding: RvAdminCustomerBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminCustomerHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvAdminCustomerBinding.inflate(layoutInflater, parent, false)
        return AdminCustomerHolder(binding)
    }

    override fun getItemCount(): Int {
        return customerLists.size
    }

    override fun onBindViewHolder(holder: AdminCustomerHolder, position: Int) {
        holder.binding.apply {
            tvTitle.text = customerLists[position].title

        }
    }

    fun updateData(newData: List<AdminCustomerData>) {
        customerLists = newData
        notifyDataSetChanged()
    }
}
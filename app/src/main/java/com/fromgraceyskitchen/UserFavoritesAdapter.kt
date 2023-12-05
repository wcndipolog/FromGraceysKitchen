package com.fromgraceyskitchen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fromgraceyskitchen.databinding.RvAdminCustomerBinding
import com.fromgraceyskitchen.databinding.RvUserFavoritesBinding

class UserFavoritesAdapter(
    var favoriteLists: List<UserFavoritesData>
) : RecyclerView.Adapter<UserFavoritesAdapter.UserFavoritiesHolder>() {
    inner class UserFavoritiesHolder(val binding: RvUserFavoritesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserFavoritiesHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvUserFavoritesBinding.inflate(layoutInflater, parent, false)
        return UserFavoritiesHolder(binding)
    }

    override fun getItemCount(): Int {
        return favoriteLists.size
    }

    override fun onBindViewHolder(holder: UserFavoritiesHolder, position: Int) {
        holder.binding.apply {
            tvProduct.text = favoriteLists[position].title
            tvPrice.text = favoriteLists[position].price.toString()
            tvDescription.text = favoriteLists[position].description
        }
    }

    fun updateData(newData: List<UserFavoritesData>) {
        favoriteLists = newData
        notifyDataSetChanged()
    }
}
package com.fromgraceyskitchen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserFavoritesFragment : Fragment() {
    private lateinit var adapter: UserFavoritesAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newFavoritesDataList = createSampleFavoritesData()

        // Initialize the adapter with the initial data
        adapter = UserFavoritesAdapter(newFavoritesDataList)

        // Assuming you have a RecyclerView with the ID 'rvAdminCustomer' in your fragment's layout
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvFavorites)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // You can later update the data in the adapter when needed
        // For example, when you have new data to insert
        val newDataToInsert = createNewSampleData()
        adapter.updateData(newDataToInsert)
    }

    private fun createSampleFavoritesData(): List<UserFavoritesData> {
        val favoriteList = mutableListOf<UserFavoritesData>()

        favoriteList.add(UserFavoritesData(1, "Product 1", "Php 100", "Description"))
        favoriteList.add(UserFavoritesData(2, "Product 2", "Php 100", "Description"))
        favoriteList.add(UserFavoritesData(3, "Product 3", "Php 100", "Description"))

        return favoriteList
    }

    private fun createNewSampleData(): List<UserFavoritesData> {
        val newDataList = mutableListOf<UserFavoritesData>()

        newDataList.add(UserFavoritesData(1, "Product 1", "Php 175", "Description"))
        newDataList.add(UserFavoritesData(2, "Product 2", "Php 100", "Description"))
        newDataList.add(UserFavoritesData(3, "Product 3", "Php 100", "Description"))
        newDataList.add(UserFavoritesData(4, "Product 4", "Php 100", "Description"))
        newDataList.add(UserFavoritesData(5, "Product 5", "Php 100", "Description"))
        newDataList.add(UserFavoritesData(6, "Product 6", "Php 100", "Description"))

        return newDataList
    }
}
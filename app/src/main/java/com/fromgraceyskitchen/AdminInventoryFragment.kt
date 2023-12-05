package com.fromgraceyskitchen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AdminInventoryFragment : Fragment() {
    private lateinit var adapter: AdminInventoryAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_inventory, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newInventoryDataList = createSampleInventoryData()

        // Initialize the adapter with the initial data
        adapter = AdminInventoryAdapter(newInventoryDataList)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvInventory)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // You can later update the data in the adapter when needed
        // For example, when you have new data to insert
        val newDataToInsert = createNewSampleData()
        adapter.updateData(newDataToInsert)
    }

    private fun createSampleInventoryData(): List<AdminInventoryData> {
        val inventoryList = mutableListOf<AdminInventoryData>()

        inventoryList.add(AdminInventoryData("Product 1", 100, 1))
        inventoryList.add(AdminInventoryData("Product 2", 200, 2))
        inventoryList.add(AdminInventoryData("Product 3", 300, 3))

        return inventoryList
    }

    private fun createNewSampleData(): List<AdminInventoryData> {
        val newDataList = mutableListOf<AdminInventoryData>()

        newDataList.add(AdminInventoryData("New Product 1", 400, 4))
        newDataList.add(AdminInventoryData("New Product 2", 500, 5))

        return newDataList
    }
}
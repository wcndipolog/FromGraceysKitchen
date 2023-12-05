package com.fromgraceyskitchen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AdminProductFragment : Fragment() {
    private lateinit var adapter: AdminProductAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newProductDataList = createSampleProductData()

        // Initialize the adapter with the initial data
        adapter = AdminProductAdapter(newProductDataList)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvProduct)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // You can later update the data in the adapter when needed
        // For example, when you have new data to insert
        val newDataToInsert = createNewSampleData()
        adapter.updateData(newDataToInsert)
    }

    private fun createSampleProductData(): List<AdminProductData> {
        val productList = mutableListOf<AdminProductData>()

        productList.add(AdminProductData("Product 1", 100))
        productList.add(AdminProductData("Product 2", 200))
        productList.add(AdminProductData("Product 3", 300))

        return productList
    }

    private fun createNewSampleData(): List<AdminProductData> {
        val newDataList = mutableListOf<AdminProductData>()

        newDataList.add(AdminProductData("Product 1", 1))
        newDataList.add(AdminProductData("Product 2", 2))

        return newDataList
    }
}
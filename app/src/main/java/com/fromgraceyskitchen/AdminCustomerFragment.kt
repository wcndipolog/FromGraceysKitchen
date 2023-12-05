package com.fromgraceyskitchen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AdminCustomerFragment : Fragment() {
    private lateinit var adapter: AdminCustomerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_customer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newCustomerDataList = createSampleCustomerData()

        // Initialize the adapter with the initial data
        adapter = AdminCustomerAdapter(newCustomerDataList)

        // Assuming you have a RecyclerView with the ID 'rvAdminCustomer' in your fragment's layout
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvCustomers)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // You can later update the data in the adapter when needed
        // For example, when you have new data to insert
        val newDataToInsert = createNewSampleData()
        adapter.updateData(newDataToInsert)
    }

    private fun createSampleCustomerData(): List<AdminCustomerData> {
        val customerList = mutableListOf<AdminCustomerData>()

        customerList.add(AdminCustomerData("Customer 1", 1))
        customerList.add(AdminCustomerData("Customer 2", 2))
        customerList.add(AdminCustomerData("Customer 3", 3))

        return customerList
    }

    private fun createNewSampleData(): List<AdminCustomerData> {
        val newDataList = mutableListOf<AdminCustomerData>()

        newDataList.add(AdminCustomerData("New Customer 1", 4))
        newDataList.add(AdminCustomerData("New Customer 2", 5))

        return newDataList
    }

}
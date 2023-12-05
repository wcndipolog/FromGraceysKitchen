package com.fromgraceyskitchen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class AdminPlatform : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_platform)

        bottomNavigationView = findViewById(R.id.admin_navigation)
        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.bottom_dashboard ->{
                    replaceFragment(AdminDashboardFragment())
                    true
                }
                R.id.bottom_product ->{
                    replaceFragment(AdminProductFragment())
                    true
                }
                R.id.bottom_inventory ->{
                    replaceFragment(AdminInventoryFragment())
                    true
                }
                R.id.bottom_customer ->{
                    replaceFragment(AdminCustomerFragment())
                    true
                }
                R.id.bottom_user ->{
                    replaceFragment(AdminUserFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(UserHomeFragment())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}
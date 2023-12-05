package com.fromgraceyskitchen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class UserPlatform : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_platform)

        bottomNavigationView = findViewById(R.id.user_navigation)

        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.bottom_home ->{
                    replaceFragment(UserHomeFragment())
                    true
                }
                R.id.bottom_search ->{
                    replaceFragment(UserSearchFragment())
                    true
                }
                R.id.bottom_cart ->{
                    replaceFragment(UserCartFragment())
                    true
                }
                R.id.bottom_favorites ->{
                    replaceFragment(UserFavoritesFragment())
                    true
                }
                R.id.bottom_profile ->{
                    replaceFragment(UserProfileFragment())
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
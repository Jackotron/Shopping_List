package com.example.shopping_list.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.shopping_list.R
import com.example.shopping_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }

    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {
                    Log.d("MyLog", "Settings")
                }
                R.id.notes -> {
                    Log.d("MyLog", "Notes")
                }
                R.id.shop_list -> {
                    Log.d("MyLog", "Shop_list")
                }
                R.id.new_item -> {
                    Log.d("MyLog", "New_item")
                }
            }
            true
        }
    }
}
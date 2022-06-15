package com.example.shopping_list.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.shopping_list.R
import com.example.shopping_list.databinding.ActivityMainBinding
import com.example.shopping_list.fragments.FragmentManager
import com.example.shopping_list.fragments.NoteFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
        FragmentManager.setFragment(NoteFragment.newInstance(), this)
    }

    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {

                }
                R.id.notes -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(), this)

                }
                R.id.shop_list -> {
                }
                R.id.new_item -> {
                    FragmentManager.currentFlag?.onClickNew()
                }
            }
            true
        }
    }
}
package com.example.shopping_list.fragments

import androidx.appcompat.app.AppCompatActivity
import com.example.shopping_list.R

object FragmentManager {
    var currentFlag: BaseFragment? = null

    fun setFragment(newFrag: BaseFragment, activity: AppCompatActivity) {
        val transition = activity.supportFragmentManager.beginTransaction()
        transition.replace(R.id.placeHolder, newFrag)
        transition.commit()
        currentFlag = newFrag
    }
}
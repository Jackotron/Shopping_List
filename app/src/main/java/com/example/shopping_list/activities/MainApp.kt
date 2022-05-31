package com.example.shopping_list.activities

import android.app.Application
import com.example.shopping_list.db.MainDataBase

class MainApp :Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}
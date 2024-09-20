package com.example.buoi_03.buoi_08

import android.content.Context
import android.content.Context.MODE_PRIVATE

object SharePreferentUtils {
    fun SaveName(name: String, context: Context){

        //lay preferences bang context
        val preferences = context.getSharedPreferences("abc", MODE_PRIVATE)
        //luu du lieu string bang key "name"
        preferences.edit().putString("name", name).apply()
    }

    fun getName(context: Context): String{
        //lenh lay prefereces bang context
        val preferences = context.getSharedPreferences("abc", MODE_PRIVATE)
        //lay du lieu
        return preferences.getString("name", "")?:""
    }
}
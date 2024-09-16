package com.example.buoi_03.Buoi_7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.buoi_03.R
import com.example.buoi_03.R.id
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class Buoi07_BarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buoi07_bar)

        val vpPage = findViewById<ViewPager2>(R.id.vpPage)
        val nvgData = findViewById<BottomNavigationView>(R.id.nvgData)
        val adapter = ViewPagerAdapter(this)
        vpPage.adapter = adapter

        //khong cho nguoi dung vuot chuyen tab bar
        vpPage.isUserInputEnabled = false

        nvgData.setOnItemSelectedListener {
            if(it.itemId == id.home){
                vpPage.currentItem = 0
            }else if(it.itemId == id.home2){
                vpPage.currentItem = 1
            }else if(it.itemId == id.home3){
                vpPage.currentItem = 2
            }else{
                vpPage.currentItem = 3
            }

            return@setOnItemSelectedListener true
        }
    }
}
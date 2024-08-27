package com.example.buoi_03.Buoi_6

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.buoi_03.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

    }

    //Lambda Function
    private var tinhtrungbinh: (()-> Unit) = {
        Toast.makeText(this, "gagag", Toast.LENGTH_LONG).show()
    }

    private var tinhtoan: ((Int) -> Unit) = {
        Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
    }
}
package com.example.buoi_03.Buoi_6

import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.buoi_03.R

fun TextView.SetName(){
    text = "Do Quoc Khanh"
    setTextColor(ContextCompat.getColor(context, R.color.black))
}
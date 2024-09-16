package com.example.buoi_03.Buoi_7

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buoi_03.R

class Buoi07_2_Activity : AppCompatActivity() {

    private var btnBack: Button? = null
    private var tvShow: TextView? = null



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buoi072)
        btnBack = findViewById(R.id.btn_back)
        tvShow = findViewById(R.id.tv_showdata)

        val nber = intent.extras?.getInt("key11", -1)
        val str = intent.extras?.getString("key12", "")
        val data = intent.extras?.getString("key3") as? SeventData

        tvShow?.text = "$nber$str \n ${data?.title} \n ${data?.content}"

        btnBack?.setOnClickListener{
            val intent = Intent()
            intent.putExtra("key4", 1)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
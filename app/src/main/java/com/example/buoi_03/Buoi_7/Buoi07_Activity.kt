package com.example.buoi_03.Buoi_7

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buoi_03.R

class Buoi07_Activity : AppCompatActivity() {
    private var flFragment: FrameLayout? = null
    private var btnOpen: Button? = null

    //Truyen nguoc du lieu tu Buoi07_2 ve Buoi07
    private val resultFor = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result: ActivityResult ->
        if(result.resultCode == Activity.RESULT_OK){
            val nb = result.data?.extras?.getInt("key4")
            Toast.makeText(this, "$nb", Toast.LENGTH_SHORT).show()
        }
    }

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buoi07)
        flFragment = findViewById(R.id.flFragment)
        btnOpen = findViewById(R.id.btnOpen)
        val flFragment = BlankFragment()

        val fragmenTransaction = supportFragmentManager.beginTransaction()
        fragmenTransaction.add(R.id.flFragment, flFragment, flFragment.tag).commitAllowingStateLoss()

        Open()

        val fragment1 = BlankFragment.newFragment("day la data")
    }

    fun toastLinhTinh(){
        Toast.makeText(this, "My Teritory, my rules", Toast.LENGTH_SHORT).show()
    }

    private fun Open(){
        btnOpen?.setOnClickListener{
            val intent = Intent(this, Buoi07_BarActivity::class.java)
            intent.putExtra("key11", 10)
            intent.putExtra("key12", "Toi la sieu nhan")


            val data = SeventData().apply {
                this.title = "Day la Title"
                this.content = "day la content"
            }
            intent.putExtra("key3", data)
            //startActivity(intent)

            resultFor.launch(intent)
        }
    }
}
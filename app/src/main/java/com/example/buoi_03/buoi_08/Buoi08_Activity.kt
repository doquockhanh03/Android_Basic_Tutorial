package com.example.buoi_03.buoi_08

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buoi_03.R

class Buoi08_Activity : AppCompatActivity() {

    var edtName: EditText? = null
    var btnSave: Button? = null
    var tvName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buoi08)

        edtName = findViewById(R.id.EdtName)
        tvName = findViewById(R.id.tvName)
        btnSave = findViewById(R.id.btnSave)

        //lay du lieu duoc luu o local va set vao textview
        tvName?.text = SharePreferentUtils .getName(this)

        btnSave?.setOnClickListener{
//            val name = edtName?.text.toString().trim()
//            SharePreferentUtils.SaveName(name, this)
//
//            tvName?.text = SharePreferentUtils .getName(this)
            val userProfileDao = AppRoomDatabase.AppDatabase.getDatabase(this).UserProfileDAO()

            userProfileDao.insert(UserProfile(
                name = "DO QUOC KHANH ${System.currentTimeMillis()}",
                age = 10,
                gender = "Nam",
                high = "171cm",
                weight = "54kg"
            ))
            tvName?.text = AppRoomDatabase.AppDatabase.getDatabase(this).UserProfileDAO().getAllUser().toString()

        }
    }
}
package com.example.buoi_03.BTVN

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import com.example.buoi_03.R

class UpdateUserActivity : AppCompatActivity() {

    private var edtFullname: EditText? = null
    private var edtDate: EditText? = null
    private var edtPhone: EditText? = null
    private  var btnUpdate: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_update_user)

        edtDate = findViewById(R.id.edtDate)
        edtPhone = findViewById(R.id.edtPhone)
        edtFullname = findViewById(R.id.edtFullname)
        btnUpdate = findViewById(R.id.btn_updates)

        edtDate?.addTextChangedListener{
            setEnableButton()
        }

        edtPhone?.addTextChangedListener {
            setEnableButton()
        }

        edtFullname?.addTextChangedListener {
            setEnableButton()
        }
    }


    private fun setEnableButton(){
        btnUpdate?.isEnabled = Checker()
        if(Checker()){
            btnUpdate?.background = ContextCompat.getDrawable(this, R.drawable.backgound_button)
        }else{
            btnUpdate?.background = ContextCompat.getDrawable(this, R.drawable.background_button_disable)
        }
    }

    private fun Checker(): Boolean{
        return edtDate?.text.toString().trim().isNotEmpty() &&
                edtPhone?.text.toString().trim().isNotEmpty() &&
                edtFullname?.text.toString().trim().isNotEmpty()
    }
}
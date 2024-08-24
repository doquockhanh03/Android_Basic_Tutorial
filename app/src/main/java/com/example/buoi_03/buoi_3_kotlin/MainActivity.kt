package com.example.buoi_03.buoi_3_kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.buoi_03.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val student = Student()

        //set du lieu cho bien
        student.name = "Do Quoc Khanh"
        student.age = 20

        //set du lieu kieu 2
        val student2 = Student().apply {
            this.name = "Do Quoc Khanh"
            this.age = 20
        }

        //get du lieu
        var ten: String = student.name
        var tuoi: Int = student.age


        //List
        val studentList = ArrayList<DataClass>()
        studentList.add(DataClass("Khanh", 20))

        //Cac kieu vong for
        for(i in 0..studentList.size){
        }

        for(student in studentList){
        }

        // Ham mo rong cua List
        studentList.forEach{
            it.name
        }

        // Duyet vong for co tra ve vi tri index
        studentList.forEachIndexed{index, dataClass ->
        }

        //Ham lọc
        studentList.filter{ it.name == "aaa" }

        // Tra ve phan tu dau tien co ten la...
        studentList.firstOrNull{it.name == "aaa"}

        //when giong voi switch case

        //Cong 2 chuoi
        var a: String = "aaa"
        var b: String = "bbb"
        //cach 1
        var c: String = a + b
        //cach 2
        var d: String = "$a$b"

        a.isEmpty() //bien a co the rong hay khong rong: false - dang rong
        a.isNotEmpty() //bien a co the rong hay khong rong: true - dang rong
        a.isNullOrEmpty() //bien a co the null hoac rong hay khong rong: true - null hoac rong
    }


    // Ham khong tra ve gia tri
    private fun login(name : String){
    }

    // Ham co tra ve gia tri
    private fun tong(a:Int, b:Int) : Int{
        return a + b
    }

}
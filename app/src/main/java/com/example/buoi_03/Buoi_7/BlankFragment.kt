package com.example.buoi_03.Buoi_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.buoi_03.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class BlankFragment : Fragment() {

    companion object{
        //cac key, hang so khong thay doi thi viet vao companion object

        //

        fun newFragment(data: String): BlankFragment{
            val fragment = BlankFragment()
            val bundle = Bundle()

            bundle.putString("key5", "Day la Khanh sky")
            bundle.putString("key6", "Day la Khanh sky")
            bundle.putString("key7", data)
            bundle.putString("key8", data)
            fragment.arguments = bundle
            return fragment
        }
    }

    var btnClick: Button? = null

    //Khoi tao Fragment. Chi duoc goi 1 lan
    //set Style hoac Theme cho tung Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnClick = view?.findViewById(R.id.btnClick)
    }

    //Tao View cho Fragment. Chi duoc goi 1 lan
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    //Khi View duoc khoi tao xong
    //Khoi tao cac du lieu, API, findViewById
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Goi activity cha, sau do ep kieu ve activity ma ta muon
        //co 2 cach ep kieu
        //cach 1
        //(activity as Buoi07_Activity).toastLinhTinh()

        //cach 2
        //trong truong hop ep kieu that bai, ket qua se tra ve null va app khong bi die
        btnClick?.setOnClickListener{
            (activity as? Buoi07_Activity)?.toastLinhTinh()
        }
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    //Huy View truoc khi huy Fragment
    //Can phai lay mot so du lieu tu tren view truoc khi chung bi huy
    override fun onDestroyView() {
        super.onDestroyView()
    }

    //Chinh thuc chung bi huy
    override fun onDestroy() {
        super.onDestroy()
    }

    //Detach khoi Activity
    override fun onDetach() {
        super.onDetach()
    }

}
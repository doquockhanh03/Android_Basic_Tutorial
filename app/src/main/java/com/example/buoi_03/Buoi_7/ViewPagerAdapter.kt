package com.example.buoi_03.Buoi_7

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.buoi_03.Buoi_7.Fragment_Bar.BookFragment
import com.example.buoi_03.Buoi_7.Fragment_Bar.HomeFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :

    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1 -> BookFragment()
            2 -> BlankFragment()
            else -> HomeFragment()
        }
    }

}
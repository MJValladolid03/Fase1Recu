package com.marisma.fase1recu

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> InfoFragment()
            1 -> StartFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    companion object {
        private const val NUM_PAGES = 2
    }
}

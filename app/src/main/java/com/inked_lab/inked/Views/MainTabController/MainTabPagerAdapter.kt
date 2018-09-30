package com.inked_lab.inked.Views.MainTabController

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.inked_lab.inked.Views.AlertsView.AlertsFragment

class MainTabPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    private val TAG = "MainTabPagerAdapter"

    override fun getCount(): Int { return MainTabType.values().size }


    private var homeFragment: Fragment = Fragment()
    private var homeFragment2: Fragment = Fragment()
    private var homeFragment3: Fragment = Fragment()
    private var homeFragment4: Fragment = Fragment()
    private var alertsFragment: Fragment = AlertsFragment()


    override fun getItem(position: Int): Fragment {
        val tabType = MainTabType.fromInt(position)

        return when(tabType){
            MainTabType.Home -> {
                homeFragment
            }
            MainTabType.WatchList -> {
                homeFragment2
            }
            MainTabType.Alert -> {
                alertsFragment
            }
            MainTabType.More -> {
                homeFragment3
            }
            else -> {
                homeFragment4
            }
        }
    }
}
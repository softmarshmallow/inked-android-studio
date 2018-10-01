package com.inked_lab.inked.Views.MainTabController

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.inked_lab.inked.Views.AlertsView.AlertsFragment
import com.inked_lab.inked.Views.HomeView.HomeFragment
import com.inked_lab.inked.Views.WatchListView.WatchListFragment

class MainTabPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    private val TAG = "MainTabPagerAdapter"

    override fun getCount(): Int { return MainTabType.values().size }


    private var homeFragment: Fragment = HomeFragment()
    private var watchListFragment: Fragment = WatchListFragment()
    private var extraOptionsFragment: Fragment = Fragment()
    private var alertsFragment: Fragment = AlertsFragment()


    override fun getItem(position: Int): Fragment {
        val tabType = MainTabType.fromInt(position)

        return when(tabType){
            MainTabType.Home -> {
                homeFragment
            }
            MainTabType.WatchList -> {
                watchListFragment
            }
            MainTabType.Alert -> {
                alertsFragment
            }
            MainTabType.More -> {
                extraOptionsFragment
            }
            else -> {
                throw Error("No Tab named $tabType")
            }
        }
    }
}

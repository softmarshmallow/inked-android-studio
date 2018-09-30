package com.inked_lab.inked.Views.MainTabController

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.R
import devlight.io.library.ntb.NavigationTabBar
import android.support.v4.view.ViewPager
import android.graphics.Color.parseColor
import android.support.v4.view.PagerAdapter
import android.view.View
import kotlinx.android.synthetic.main.activity_main_tab_controller.*
import android.R.string.cancel
import android.provider.Telephony.MmsSms.PendingMessages.ERROR_TYPE
import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat
import android.support.design.widget.TabLayout
import android.support.v7.app.AlertDialog
import android.view.Menu
import com.inked_lab.inked.R.string.action_settings
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast


class MainTabControllerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tab_controller)
        InitTabBar()

    }


    private fun InitTabBar() {
        val adapter = MainTabPagerAdapter(supportFragmentManager)
        val viewPager = mainTabViewPager
        viewPager.adapter = adapter

        val colors = resources.getStringArray(R.array.default_preview)

        val navigationTabBar = findViewById<View>(
                R.id.ntb_horizontal) as NavigationTabBar

        val models = ArrayList<NavigationTabBar.Model>()
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_featured),
                        Color.parseColor(colors[0]))
                        .title("Home")
                        .badgeTitle("New")
                        .build()
        )
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_watch),
                        Color.parseColor(colors[0]))

                        .title("Watchlist")
                        // .badgeTitle("with")
                        .build()
        )
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_alerts),
                        Color.parseColor(colors[0]))
                        .title("Alerts")
                        .badgeTitle("3")
                        .build()
        )
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_more),
                        Color.parseColor(colors[0]))
                        //                        .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                        .title("More")
                        // .badgeTitle("icon")
                        .build()
        )


        navigationTabBar.models = models
        navigationTabBar.setViewPager(viewPager)
        navigationTabBar.setIsBadged(true)
        navigationTabBar.isBehaviorEnabled = true


        navigationTabBar.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                navigationTabBar.models[position]
                        .hideBadge()
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        navigationTabBar.postDelayed({
            for (i in 0 until navigationTabBar.models
                    .size) {
                val model = navigationTabBar.models[i]
                navigationTabBar.postDelayed({ model.showBadge() }, (i * 100).toLong())
            }
        }, 500)
    }


    fun FocusOnTab(tabType: MainTabType) {
        mainTabViewPager.setCurrentItem(tabType.tabID, true)
    }


    fun SetTabIconAsSelected(tab: TabLayout.Tab) {
        val tabIconColor = ContextCompat.getColor(applicationContext,
                R.color.tabSelectedIconColor)
        tab.icon!!
                .setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN)
    }


    fun SetTabIconAsUnSelected(tab: TabLayout.Tab) {
        val tabIconColor = ContextCompat.getColor(applicationContext,
                R.color.tabUnselectedIconColor)
        tab.icon!!
                .setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN)
    }


    //endregion


    //region confirm exit app


    override fun onBackPressed() {
        AskIfQuitApp()
    }

    fun AskIfQuitApp() {
        Toast(this).show()
    }
}

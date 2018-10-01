package com.inked_lab.inked.Views.MainTabController

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.R
import devlight.io.library.ntb.NavigationTabBar
import android.support.v4.view.ViewPager
import android.view.View
import kotlinx.android.synthetic.main.activity_main_tab_controller.*
import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat
import android.support.design.widget.TabLayout
import android.widget.Toast
import com.inked_lab.inked.Views.DeveloperView.DeveloperSettingsActivity


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

//        val preview_colors = resources.getStringArray(R.array.default_preview)

        val navigationTabBar = findViewById<View>(
                R.id.ntb_horizontal) as NavigationTabBar

        val models = ArrayList<NavigationTabBar.Model>()
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_featured),
                        R.color.tabUnselectedIconColor)
                        .title("Home")
                        .badgeTitle("New")
                        .build()
        )
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_watch),
                        R.color.tabUnselectedIconColor)
                        .title("Watchlist")
                        // .badgeTitle("with")
                        .build()
        )
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_alerts),
                        R.color.tabUnselectedIconColor)
                        .title("Alerts")
                        .badgeTitle("3")
                        .build()
        )
        models.add(
                NavigationTabBar.Model.Builder(
                        resources.getDrawable(R.drawable.ic_tab_more),
                        R.color.tabUnselectedIconColor)
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

                val tabType = MainTabType.fromInt(position)
                when(tabType){
                    MainTabType.More -> {
                        val intent = Intent(this@MainTabControllerActivity, DeveloperSettingsActivity::class.java)
                        startActivity(intent)
                    }
                }

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

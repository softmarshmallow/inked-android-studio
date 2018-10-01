package com.inked_lab.inked.Views.StockCalendar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class StockCalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stock_calendar_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, StockCalendarFragment.newInstance())
                    .commitNow()
        }
    }

}

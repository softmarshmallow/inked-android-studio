package com.inked_lab.inked.Views.DeveloperView.TestViews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import com.inked_lab.inked.R
import kotlinx.android.synthetic.main.activity_web_api_test.*
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.inked_lab.inked.WebServices.StockCalendarService
import java.io.Console
import java.util.*


class WebApiTestActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    val TAG = "WebApiTestActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_api_test)
        initUI()
    }

    fun initUI(){
        initSpinner()

        button_TestThisApi.setOnClickListener {

        }

    }

    fun initSpinner(){
        val list = ArrayList<String>()
        list.add("Calendar Test")
        list.add("list 2")
        list.add("list 3")
        val dataAdapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, list)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        ApiSelectSpinner.adapter = dataAdapter
        ApiSelectSpinner.onItemSelectedListener = this

    }


    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        print(position)
        Log.d(TAG,"position::$position")
        when(position){
            0 -> {
                StockCalendarService.GetCalendarEvents(StockCalendarService.CalendarRangeType.Monthly, Date(2018, 10, 1), displayOnConsoleView, displayOnConsoleView)
            }
        }
    }

    private val displayOnConsoleView: (String) -> Unit = {
        textView_ApiResultDisplay.text = it
    }



}

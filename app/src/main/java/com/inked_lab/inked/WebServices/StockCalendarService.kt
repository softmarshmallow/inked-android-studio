package com.inked_lab.inked.WebServices

import android.util.Log
import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.inked_lab.inked.Models.StockCalendarEventModel
import java.text.SimpleDateFormat
import java.util.*


object StockCalendarService{
    val TAG = "StockCalendarService"

    enum class CalendarRangeType(val string: String){
        Daily("daily"),
        Weekly("weekly"),
        Monthly("monthly")
    }

    fun GetCalendarEvents(rangeType: CalendarRangeType, date: Date, callback: (MutableList<StockCalendarEventModel>)->Unit, errorCallback: (errorMessage: String)->Unit){

        val dateFormat = SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
        val strDate = dateFormat.format(date)
        Log.d(TAG, date.toString())
        val rangeTypeStr = rangeType.string
        "api/stock_events/$rangeTypeStr?query_date=$strDate".httpGet().responseJson { request, response, result ->
            val (data, error) = result
            if (error == null) {
                val gson = Gson()
                val type = object : TypeToken<MutableList<StockCalendarEventModel>>() {}.type
                val builtData = gson.fromJson<MutableList<StockCalendarEventModel>>(data!!.content, type)
                callback(builtData)
                Log.d(TAG, data.content)
                Log.d(TAG, response.responseMessage)
                Log.d(TAG, response.url.toString())

                //do something when success
            } else {
                //error handling
                errorCallback(error.localizedMessage)
            }
        }

    }

}
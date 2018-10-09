package com.inked_lab.inked.WebServices

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPut
import java.text.SimpleDateFormat
import java.util.*


object StockCalendarService{

    enum class CalendarRangeType(string: String){
        Daily("daily"),
        Weekly("weekly"),
        Monthly("monthly")
    }

    fun GetCalendarEvents(rangeType: CalendarRangeType, date: Date, callback: (String)->Unit, errorCallback: (errorMessage: String)->Unit){

        val dateFormat = SimpleDateFormat("yyyy-mm-dd")
        val strDate = dateFormat.format(date)

        val rangeTypeStr = rangeType.toString()

        "/api/stock_events/$rangeTypeStr?query_date=$strDate".httpGet().responseString { request, response, result ->
            val (data, error) = result
            if (error == null) {
                callback(data!!)
                //do something when success
            } else {
                //error handling
                errorCallback(error.localizedMessage)
            }
        }

    }

}
package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.StockCalendarEventModel
import java.util.*

class StockCalendarEventMockDataSrouce{
    companion object {

        val _1 = StockCalendarEventModel("").apply {
            incidentContent = "DUMMY"
            eventName = "DUMMY"
            incidentDate = Date()
        }

        val _2 = StockCalendarEventModel("").apply {
            incidentContent = "DUMMY"
            eventName = "DUMMY"
            incidentDate = Date()
        }


        val _3 = StockCalendarEventModel("").apply {
            incidentContent = "DUMMY"
            eventName = "DUMMY"
            incidentDate = Date()
        }


        val _4 = StockCalendarEventModel("").apply {
            incidentContent = ""
            eventName = ""
            incidentDate = Date()
        }

        val _5 = StockCalendarEventModel("").apply {
            incidentContent = ""
            eventName = ""
            incidentDate = Date()
        }


        val AllMockStockCalendarEventDataList = mutableListOf(_1, _2, _3, _4, _5)

    }
}
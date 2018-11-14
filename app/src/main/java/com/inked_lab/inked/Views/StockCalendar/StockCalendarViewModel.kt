package com.inked_lab.inked.Views.StockCalendar

import android.arch.lifecycle.ViewModel
import com.inked_lab.inked.Models.StockCalendarEventModel
import android.arch.lifecycle.MutableLiveData
import com.inked_lab.inked.MockDataSource.StockCalendarEventMockDataSrouce.Companion.AllMockStockCalendarEventDataList


class StockCalendarViewModel : ViewModel() {

    var calendarDataList: MutableLiveData<List<StockCalendarEventModel>>? = MutableLiveData()
    fun getCalanderEventList(): MutableLiveData<List<StockCalendarEventModel>> {
        calendarDataList!!.value = AllMockStockCalendarEventDataList
        if (calendarDataList == null) {
            calendarDataList = MutableLiveData()
//            laodNews()
        }
        return calendarDataList!!
    }
}

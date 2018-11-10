package com.inked_lab.inked.Views.StockCalendar

import android.arch.lifecycle.ViewModel
import com.inked_lab.inked.Models.StockCalendarEventModel
import android.arch.lifecycle.MutableLiveData


class StockCalendarViewModel : ViewModel() {

    var calendarDataList: MutableLiveData<List<StockCalendarEventModel>>? = null
    fun getCalanderEventList(): MutableLiveData<List<StockCalendarEventModel>> {
        if (calendarDataList == null) {
            calendarDataList = MutableLiveData()
//            laodNews()
        }
        return calendarDataList!!
    }
}

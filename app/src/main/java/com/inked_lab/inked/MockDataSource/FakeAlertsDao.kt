package com.inked_lab.inked.MockDataSource

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.inked_lab.inked.Models.AlertModel

class FakeAlertsDao {
    // A fake database table
    private val alertList = AlertsMockDataSource.AllAlertsList
    // MutableLiveData is from the Architecture Components Library
    // LiveData can be observed for changes
    private val alerts = MutableLiveData<List<AlertModel>>()

    init {
        // Immediately connect the now empty quoteList
        // to the MutableLiveData which can be observed
        alerts.value = alertList
    }

    fun addAlert(alert: AlertModel) {
        alertList.add(alert)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        alerts.value = alertList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    fun getAlerts() = alerts as LiveData<List<AlertModel>>
}
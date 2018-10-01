package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.AlertModel

class AlertsRepository private constructor(private val alertDao: FakeAlertsDao) {

    // This may seem redundant.
    // Imagine a code which also updates and checks the backend.
    fun addAlert(alert: AlertModel) {
        alertDao.addAlert(alert)
    }

    fun getAlerts() = alertDao.getAlerts()

    companion object {
        // Singleton instantiation you already know and love
        @Volatile private var instance: AlertsRepository? = null

        fun getInstance(alertDao: FakeAlertsDao) =
                instance ?: synchronized(this) {
                    instance ?: AlertsRepository(alertDao).also { instance = it }
                }
    }
}
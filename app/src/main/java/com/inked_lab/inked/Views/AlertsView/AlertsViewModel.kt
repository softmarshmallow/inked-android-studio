package com.inked_lab.inked.Views.AlertsView

import android.arch.lifecycle.ViewModel;
import com.inked_lab.inked.MockDataSource.AlertsRepository
import com.inked_lab.inked.Models.AlertModel

class AlertsViewModel(private val alertsRepository: AlertsRepository) : ViewModel() {
    fun getAlerts() = alertsRepository.getAlerts()

    fun addAlert(alert: AlertModel) = alertsRepository.addalert(alert)
}
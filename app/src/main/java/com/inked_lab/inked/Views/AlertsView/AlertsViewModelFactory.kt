package com.inked_lab.inked.Views.AlertsView

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.inked_lab.inked.MockDataSource.AlertsRepository

class AlertsViewModelFactory(private val alertsRepository: AlertsRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AlertsViewModel(alertsRepository) as T
    }
}
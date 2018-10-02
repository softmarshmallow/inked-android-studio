package com.inked_lab.inked.Utils

import com.inked_lab.inked.MockDataSource.AlertsRepository
import com.inked_lab.inked.MockDataSource.FakeDatabase
import com.inked_lab.inked.Views.AlertsView.AlertsViewModelFactory

object InjectorUtils {

    // This will be called from QuotesActivity
    fun provideAlertsViewModelFactory(): AlertsViewModelFactory {
        // ViewModelFactory needs a repository, which in turn needs a DAO from a database
        // The whole dependency tree is constructed right here, in one place
        val alertsRepository = AlertsRepository.getInstance(FakeDatabase.getInstance().alertsDao)
        return AlertsViewModelFactory(alertsRepository)
    }


}
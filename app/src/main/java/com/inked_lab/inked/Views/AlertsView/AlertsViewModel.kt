package com.inked_lab.inked.Views.AlertsView

import android.arch.lifecycle.ViewModel;
import com.inked_lab.inked.MockDataSource.AlertsMockDataSource.Companion.AllAlertsList
import com.inked_lab.inked.Models.AlertModel

class AlertsViewModel : ViewModel() {
    var alertsDataList: MutableList<AlertModel> = AllAlertsList
}
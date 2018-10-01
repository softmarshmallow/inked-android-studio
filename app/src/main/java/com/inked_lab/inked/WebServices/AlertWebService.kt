package com.inked_lab.inked.WebServices

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.inked_lab.inked.MockDataSource.AlertsMockDataSource
import com.inked_lab.inked.MockDataSource.AlertsMockDataSource.Companion.AllAlertsList
import com.inked_lab.inked.Models.AlertModel


fun GetAllAlerts(callback: (alerts: List<AlertModel>)->Unit, errorCallback: (errorMessage: String)->Unit){
    if (isOfflineMode){
//        callback(MutableLiveData(AllAlertsList))
        callback(AllAlertsList)
    }else{

    }

}
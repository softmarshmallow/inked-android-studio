package com.inked_lab.inked

import android.app.Application
import android.content.Context
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import com.inked_lab.inked.WebServices.ApiController
import io.realm.Realm


class InkedApplication: Application(){
    companion object {
        var context: Context? = null
    }
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        context = this
        initVPSApi()
        initFacebook()
    }

    fun initVPSApi(){
        ApiController.setup()
    }

    fun initFacebook(){
        FacebookSdk.sdkInitialize(applicationContext)
        AppEventsLogger.activateApp(this)
    }
}
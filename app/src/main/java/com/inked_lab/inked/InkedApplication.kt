package com.inked_lab.inked

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import io.realm.Realm


class InkedApplication: Application(){
    companion object {
        var context: Context? = null
    }
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        context = this
    }
}
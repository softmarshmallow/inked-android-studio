package com.inked_lab.inked.Views.DeveloperView.TestViews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.iid.FirebaseInstanceId
import com.inked_lab.inked.R
import kotlinx.android.synthetic.main.activity_device_information_view.*

class DeviceInformationViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_information_view)
        initUI()
    }

    fun initUI(){
        loadToken()
    }


    fun loadToken(){
        val token = FirebaseInstanceId.getInstance().getToken()
        tokenDisplayTextView.text = token
    }
}

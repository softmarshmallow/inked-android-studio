package com.inked_lab.inked.Views.DeveloperView.TestViews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.R
import android.content.Context.NOTIFICATION_SERVICE
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v4.app.NotificationCompat
import android.util.Log
import kotlinx.android.synthetic.main.activity_test_notification.*


class TestNotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_notification)
        initUI()
    }


    fun initUI(){

        TestNotificationButton.setOnClickListener {
            createNotification()
            finish()
        }
    }


    fun createNotification(){
        Log.d("NOTI", "createNotification")
        val mBuilder = NotificationCompat.Builder(this)

        //Create the intent that’ll fire when the user taps the notification//

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.androidauthority.com/"))
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)

        mBuilder.setContentIntent(pendingIntent)

        mBuilder.setSmallIcon(R.drawable.ic_github_logo)
        mBuilder.setContentTitle("My notification")
        mBuilder.setContentText("Hello World!")

        val mNotificationManager =

                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        mNotificationManager.notify(1, mBuilder.build())
    }
}

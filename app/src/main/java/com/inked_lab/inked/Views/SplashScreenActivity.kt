package com.inked_lab.inked.Views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.R
import android.content.Intent
import android.os.Handler
import com.inked_lab.inked.Views.AuthView.AuthHomeActivity
import com.inked_lab.inked.Views.MainTabController.MainTabControllerActivity


class SplashScreenActivity : AppCompatActivity() {

    val TAG = "SplashScreenActivity"
    private val delayMilliSeconds:Long = 750

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set as fullscreen
        setTheme(R.style.AppTheme_FullScreen_NoActionBar)
        setContentView(R.layout.activity_splash_screen)

        Test()
    }

    fun StartWaiting() {
        handler.postDelayed(r, delayMilliSeconds)
    }

    override fun onResume() {
        super.onResume()
        StartWaiting()
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(r)
    }

    var handler = Handler()
    var r: Runnable = Runnable { MoveToNextActivity() }

    fun MoveToNextActivity() {
        //TODO:: CHECK Update
        val intent = Intent(this, AuthHomeActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun Test(){
        com.inked_lab.inked.Tests.Test.TestSplash()

    }
}

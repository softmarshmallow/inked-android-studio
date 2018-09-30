package com.inked_lab.inked.Views.DeveloperView

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.R
import com.inked_lab.inked.Views.SplashScreenActivity
import kotlinx.android.synthetic.main.activity_developer_access.*

class DeveloperAccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer_access)

        setDeveloperOptionButtonActions()

    }

    private fun setDeveloperOptionButtonActions(){
        DeveloperOptionButton_ShowTestTab.setOnClickListener {
            intent = Intent(this, SplashScreenActivity::class.java)
            startActivity(intent)
        }

    }
}

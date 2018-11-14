package com.inked_lab.inked.Views.IncidentDetailView

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inked_lab.inked.Models.AnalyzedIncidentModel
import com.inked_lab.inked.R

class IncidentDetailActivity : AppCompatActivity() {


    companion object {
        lateinit var data:  AnalyzedIncidentModel
        fun StartActivity(context: Context, data: AnalyzedIncidentModel){
            this.data = data
            context.startActivity(Intent(context, IncidentDetailActivity::class.java))
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.activity_incident_detail)

        initUI()
    }


    fun initUI(){

    }
}

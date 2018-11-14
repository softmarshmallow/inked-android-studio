package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.InkedApplication.Companion.context
import com.inked_lab.inked.Models.AlertModel
import com.inked_lab.inked.R

class AlertsMockDataSource{
    companion object {
        private var defaultTime = "3day ago"
        val alert1 = AlertModel("0").apply {
            time = defaultTime
            content = context!!.getString(R.string.dummy_content_lorem)
            isReaded = true
            humanTime = "seconds ago"

        }

        val alert2 = AlertModel("0").apply {
            time = defaultTime
            content = context!!.getString(R.string.dummy_content_cicero)
            isReaded = true
            humanTime = "seconds ago"
        }

        val alert3 = AlertModel("0").apply {
            time = defaultTime
            content = context!!.getString(R.string.dummy_content_lorem)
            isReaded = true
            humanTime = "seconds ago"
        }


        val AllAlertsList = mutableListOf<AlertModel>(
                alert1,
                alert3,
                alert2,
                alert1,
                alert3,
                alert1,
                alert3,
                alert2,
                alert1,
                alert3
        )


    }
}
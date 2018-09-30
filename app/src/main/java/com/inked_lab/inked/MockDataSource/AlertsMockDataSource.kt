package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.AlertModel

class AlertsMockDataSource{
    companion object {
        val alert1 = AlertModel("0").apply {
            time = ""
            content = "Margot Kim 실종 신고"
            isReaded = true
            humanTime = "seconds ago"
        }

        val alert2 = AlertModel("0").apply {
            time = ""
            content = "Margot Kim 실종 신고"
            isReaded = true
            humanTime = "seconds ago"
        }

        val alert3 = AlertModel("0").apply {
            time = ""
            content = "Margot Kim 실종 신고"
            isReaded = true
            humanTime = "seconds ago"
        }


        val AllAlertsList = mutableListOf<AlertModel>(
                alert1,
                alert2,
                alert3
        )


    }
}
package com.inked_lab.inked.Models

import io.realm.RealmObject

data class AlertModel(val ID: String): RealmObject() {
    var content: String = "nothing to display"
    var time: String = "2018.12.25:12:12:12"
    var humanTime: String = "23 sec ago"
    var isReaded: Boolean = false
}
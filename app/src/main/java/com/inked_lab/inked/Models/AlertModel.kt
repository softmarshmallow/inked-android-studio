package com.inked_lab.inked.Models

data class AlertModel(val ID: String) {
    var content: String = "nothing to display"
    var time: String = "2018.12.25:12:12:12"
    var humanTime: String = "23 sec ago"
    var isReaded: Boolean = false
    var alertType: inkedAlertType = inkedAlertType.Misc

/*    override fun toString(): String {
        return "$time\n$content"
    }*/
}

enum class inkedAlertType{
    Misc,
    KeywordAlert,
    CompanyAlert,
    PeopleAlert,
    TopicAlert;
}
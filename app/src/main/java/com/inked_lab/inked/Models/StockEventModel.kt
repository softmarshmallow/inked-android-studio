package com.inked_lab.inked.Models

import java.util.*


data class StockEventModel(val ID: String){
    var eventName: String = "New Event"
    var eventContent: String = "event description goes here..."
    var eventTime: Date = Date("2018.12.25:12:12:12")
    var relatedNewsList: MutableList<AnalyzedNewsModel> = mutableListOf()
    var incidents: MutableList<String> = mutableListOf()

}

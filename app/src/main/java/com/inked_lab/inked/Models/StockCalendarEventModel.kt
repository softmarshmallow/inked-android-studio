package com.inked_lab.inked.Models

import com.google.gson.annotations.SerializedName
import java.util.*


data class StockCalendarEventModel
(@SerializedName("id") val ID: String)
{

    @SerializedName("event_name")
    var eventName: String = "New Event"

    @SerializedName("event_content")
    var eventContent: String = "event description goes here..."

    @SerializedName("event_time")
    lateinit var eventTime: Date

    @SerializedName("related_news_list")
    var relatedNewsList: MutableList<AnalyzedNewsModel> = mutableListOf()

    @SerializedName("incidents")
    var incidents: MutableList<String> = mutableListOf()

    @SerializedName("links")
    var links: MutableList<String> = mutableListOf()

    @SerializedName("extra_fields")
    var extraFields: Map<String, String> = hashMapOf()

    @SerializedName("createdAt")
    lateinit var createdAt: Date

    @SerializedName("updatedAt")
    lateinit var updatedAt: Date
}
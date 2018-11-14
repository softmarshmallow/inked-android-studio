package com.inked_lab.inked.Models

import com.google.gson.annotations.SerializedName
import java.util.*


data class StockCalendarEventModel
(@SerializedName("id") val ID: String): AnalyzedIncidentModel()
{

    @SerializedName("event_name")
    var eventName: String = "Event"

    @SerializedName("links")
    var links: MutableList<String> = mutableListOf()

    @SerializedName("extra_fields")
    var extraFields: Map<String, String> = hashMapOf()

    @SerializedName("createdAt")
    lateinit var createdAt: Date

    @SerializedName("updatedAt")
    lateinit var updatedAt: Date
}
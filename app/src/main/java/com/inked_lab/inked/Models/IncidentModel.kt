package com.inked_lab.inked.Models

import com.google.gson.annotations.SerializedName
import com.inked_lab.inked.MockDataSource.CompanyMockDataSource
import java.util.*


open class AnalyzedIncidentModel{
    /**
     * A Content of *Incident*.
     *
     * **Example:** "대우전자 오는 18일 유상증자 회의"
     */
    @SerializedName("event_content")
    var incidentContent: String = ""



    /**
     * A Type of *Incident*.
     *
     * **Example:** "유상증자"
     */
    var incidentType: String = ""

    @SerializedName("event_time")
    lateinit var incidentDate: Date

    var relatedProducts = mutableListOf<String>()
    var relatedPeoples = mutableListOf<String>()
    var keywords = mutableListOf<String>()

    var relatedNews: MutableList<AnalyzedNewsModel> = mutableListOf()
    var primaryCompany :CompanyModel = CompanyMockDataSource.SamsungElectronics
    var relatedCompanies: MutableList<CompanyModel> = mutableListOf()

}

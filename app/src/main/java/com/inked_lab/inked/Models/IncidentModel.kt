package com.inked_lab.inked.Models

import java.util.*


class AnalyzedIncidentModel{
    /**
     * An ID of *Incident*.
     */
    lateinit var incidentID: String

    /**
     * A Content of *Incident*.
     *
     * **Example:** "대우전자 오는 18일 유상증자 회의"
     */
    var incidentContent: String = ""


    /**
     * A Type of *Incident*.
     *
     * **Example:** "유상증자"
     */
    var incidentType: String = ""
    lateinit var incidentDate: Date

    var relatedProducts = mutableListOf<String>()
    var relatedPeoples = mutableListOf<String>()
    var keywords = mutableListOf<String>()

    var relatedNews: MutableList<AnalyzedNewsModel> = mutableListOf()
    lateinit var primaryCompany :CompanyModel
    var relatedCompanies: MutableList<CompanyModel> = mutableListOf()

}

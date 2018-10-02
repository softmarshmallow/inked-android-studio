package com.inked_lab.inked.Models


class AnalyzedIncidentModel{

    var incidentName: String = ""
    var incidentType: String = ""
    var relatedNews: MutableList<AnalyzedNewsModel> = mutableListOf()
    var relatedCompanies: MutableList<CompanyModel> = mutableListOf()
}

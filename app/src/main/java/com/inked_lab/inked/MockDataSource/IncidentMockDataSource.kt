package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.MockDataSource.AnalyzedNewsMockDataSource.analyzedNewsGroup_1
import com.inked_lab.inked.MockDataSource.CompanyMockDataSource.SamsungElectronics
import com.inked_lab.inked.Models.AnalyzedIncidentModel

object IncidentMockDataSource{

    val Incident_1 = AnalyzedIncidentModel().apply {
        incidentContent = "삼성SDS 애플 납품 계약 체결"
        incidentType = "계약체결"
//        incidentDate =
        relatedProducts = mutableListOf("LCD 판")
        relatedPeoples = mutableListOf()
        keywords = mutableListOf("", "", "")
        relatedNews = analyzedNewsGroup_1
        primaryCompany = SamsungElectronics
    }
}

package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.CompanyModel
import com.inked_lab.inked.Models.KRXStockCompanyModel

object CompanyMockDataSource{

    val SamsungElectronics = KRXStockCompanyModel().apply {
        companyCode = ""
        companyCategory = "전자"
        companyName = "삼성전자"

    }



}
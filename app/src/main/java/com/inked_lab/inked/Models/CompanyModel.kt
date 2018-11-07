package com.inked_lab.inked.Models

import com.inked_lab.inked.Utils.DaumFinanceUrlBuilder


open class CompanyModel{
    var companyName: String = ""
    var companyCategory: String = ""
}

class KRXStockCompanyModel: CompanyModel() {
    var companyCode: String = ""
    var currentPrice: Int = 0
    var companyInfoUrl: String = ""
        get() = DaumFinanceUrlBuilder.GetCompanyPageUrl(companyCode)
}
package com.inked_lab.inked.Models


open class CompanyModel{
    var companyName: String = ""
    var companyCategory: String = ""
}

class KRXStockCompanyModel: CompanyModel() {
    var companyCode: String = ""
}
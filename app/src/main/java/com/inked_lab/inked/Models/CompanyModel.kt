package com.inked_lab.inked.Models

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.inked_lab.inked.Utils.DaumFinanceUrlBuilder


open class CompanyModel{
    @SerializedName("name")
    var companyName: String = ""

    @Expose
    var companyCategory: String = ""

    @SerializedName("code")
    var companyCode: String = ""
}

class KRXStockCompanyModel: CompanyModel() {

    @SerializedName("current_price")
    var currentPrice: Int = 0

    @Expose
    var companyInfoUrl: String = ""
        get() = DaumFinanceUrlBuilder.GetCompanyPageUrl(companyCode)

    @SerializedName("rate")
    var priceRate : String = "+2.4%"

    @SerializedName("exchange")
    var exchange: String = "KOSPI"

    @SerializedName("color")
    var color: String = "red"
}
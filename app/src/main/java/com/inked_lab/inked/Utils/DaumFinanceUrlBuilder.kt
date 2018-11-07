package com.inked_lab.inked.Utils

import android.net.Uri


object DaumFinanceUrlBuilder{


    val BaseUrl = "http://finance.daum.net"

    //EX. http://m.finance.daum.net/m/item/main.daum?code=005930
    // TODO
    fun GetCompanyPageUrl(companyCode: String) : String{
        val builder = Uri.Builder()
        builder.authority(BaseUrl)
                .appendPath("turtles")
                .appendPath("types")
                .appendQueryParameter("type", "1")
                .appendQueryParameter("sort", "relevance")
                .fragment("section-name")
        val myUrl = builder.build().toString()
        return BaseUrl
    }

}
package com.inked_lab.inked.Utils

import android.net.Uri


object DaumFinanceUrlBuilder{


    val BaseUrl = "http://m.finance.daum.net"

    //EX. http://m.finance.daum.net/m/item/main.daum?code=005930
     fun GetCompanyPageUrl(companyCode: String) : String{

        return "http://m.finance.daum.net/m/item/main.daum?code=${companyCode}"

    }
//    val builder = Uri.Builder()
//    builder.authority(BaseUrl)
//    .appendPath("m")
//    .appendPath("item")
//    .appendPath("main.daum")
//    .appendQueryParameter("code", companyCode)
//    val compPageUrl = builder.build().toString()
}
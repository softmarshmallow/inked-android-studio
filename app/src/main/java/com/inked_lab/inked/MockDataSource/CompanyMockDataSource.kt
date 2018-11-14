package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.CompanyModel
import com.inked_lab.inked.Models.KRXStockCompanyModel

object CompanyMockDataSource{

    val SamsungElectronics = KRXStockCompanyModel().apply {
        companyCode = "005930"
        companyCategory = "반도체와반도체장비"
        companyName = "삼성전자"
    }

    val SamBuToGeon = KRXStockCompanyModel().apply {
        companyCode = "001470"
        companyCategory = "건설"
        companyName = "삼부토건"

    }

    val WeMade = KRXStockCompanyModel().apply {
        companyCode = "112040"
        companyCategory = "게임소프트웨어와서비스"
        companyName = "위메이드"

    }

    val LotteFood = KRXStockCompanyModel().apply {
        companyCode = "002270"
        companyCategory = "식품"
        companyName = "롯데푸드"

    }

    val HyundaiElectric = KRXStockCompanyModel().apply {
        companyCode = "267260"
        companyCategory = "전기장비"
        companyName = "현대일렉트릭"

    }

    val SKTelecom = KRXStockCompanyModel().apply {
        companyCode = "017670"
        companyCategory = "무선통신서비스"
        companyName = "SK텔레콤"

    }

    val NexonGT = KRXStockCompanyModel().apply {
        companyCode = "041140"
        companyCategory = "게임소프트웨어와서비스"
        companyName = "넥슨지티"

    }

    val LGUPlus = KRXStockCompanyModel().apply {
        companyCode = "032640"
        companyCategory = "무선통신서비스"
        companyName = "LG유플러스"

    }

}
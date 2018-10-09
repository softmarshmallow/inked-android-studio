package com.inked_lab.inked.WebServices

import com.github.kittinunf.fuel.core.FuelManager

object ApiController{
    val BaseWebServerUrl = "http://nginx-lb-429321543.ap-northeast-2.elb.amazonaws.com/"
    fun setup(){
        FuelManager.instance.basePath = BaseWebServerUrl
    }

    val isOfflineMode: Boolean = true
}

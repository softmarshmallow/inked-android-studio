package com.inked_lab.inked.WebServices

import com.github.kittinunf.fuel.core.FuelManager

object ApiController{
    val BaseWebServerUrl = "http://ec2-52-79-134-126.ap-northeast-2.compute.amazonaws.com/"
    fun setup(){
        FuelManager.instance.basePath = BaseWebServerUrl
    }

    val isOfflineMode: Boolean = true
}


package com.inked_lab.inked.WebServices

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPost
import com.github.kittinunf.fuel.httpPut

object RegisterFCMService{
    fun RegisterFCMToken(uid: String, fcmToken:String){

        val req = listOf("device_token" to fcmToken)
        "/register_token/$uid".httpPut(req).responseString { request, response, result ->
            val (data, error) = result
            if (error == null) {
                //do something when success
            } else {
                //error handling
            }
        }
    }
}

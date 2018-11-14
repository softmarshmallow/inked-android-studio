package com.inked_lab.inked.WebServices

import android.util.Log
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import com.inked_lab.inked.Models.KRXStockCompanyModel
import java.lang.Exception

object LiveStockPriceService{
    val TAG = "LiveStockPriceService"

    fun GetLivePrice(companyCode: String, listener: (KRXStockCompanyModel) -> Unit){
        val req = listOf("code" to companyCode)
        "http://ec2-52-79-134-126.ap-northeast-2.compute.amazonaws.com/company/".httpGet(req).responseString { request, response, result ->
            val (data, error) = result
            if (error == null) {
                //do something when success
                try {
                    val ormData = Gson().fromJson(data, KRXStockCompanyModel::class.java)
                    listener(ormData)
                }catch (e: Exception){
                    Log.e(TAG, e.localizedMessage)
                }
            } else {
                Log.d(TAG, error.localizedMessage)
                //error handling
            }
        }
    }

}
package com.inked_lab.inked.WebServices

import android.arch.lifecycle.MutableLiveData
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPut
import com.inked_lab.inked.Models.PlainNewsModel
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.concurrent.timerTask

object LiveNewsService{

    var liveNewsDataList: MutableLiveData<List<PlainNewsModel>>? = null

    /*
    * Start, 백그라운드에서 지속적으로 실시간 뉴스 받아옴.
    * DataStore 에 추가,
    * */
    val UPDATE_RATE = 100
    fun startUpdateLiveNews(){
        Timer().schedule(timerTask {  }, 1)
        val fixedRateTimer = fixedRateTimer(name = "LiveNewsUpdate",
                period = UPDATE_RATE.toLong()) {
                GetLatestNews()
        }
    }

    fun GetLatestNews(){

        val req = listOf("device_token" to "")
        "/news/".httpGet(req).responseString { request, response, result ->
            val (data, error) = result
            if (error == null) {
                //do something when success
            } else {
                //error handling
            }
        }
    }

    fun NewsFactory(){

    }



//
//    fun getNews(max: Int, lastNewsID: String){
//
//    }


}
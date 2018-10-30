package com.inked_lab.inked.MockDataSource



import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.inked_lab.inked.Models.PlainNewsModel

class FakeNewsDao{
    private val newsList: MutableList<PlainNewsModel> = mutableListOf()
    private val newses = MutableLiveData<List<PlainNewsModel>>()
    init {
        newses.value = newsList
    }

    fun addNews(news: PlainNewsModel){
        newsList.add(news)
        newses.value = newsList
    }

    fun getNewses() = newses as LiveData<List<PlainNewsModel>>
}
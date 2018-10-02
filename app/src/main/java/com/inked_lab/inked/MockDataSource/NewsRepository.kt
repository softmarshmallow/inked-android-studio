package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.PlainNewsModel

class NewsRepository private constructor(private val newsDao: FakeNewsDao){
    fun addNews(news:PlainNewsModel){
        newsDao.addNews(news)
    }

    fun getNewses() = newsDao.getNewses()

    companion object {
        @Volatile private var instance: NewsRepository? = null

        fun getInstance(newsDao: FakeNewsDao) =
                NewsRepository.instance ?: synchronized(this) {
                    NewsRepository.instance
                            ?: NewsRepository(newsDao).also { NewsRepository.instance = it }
                }
    }
}
package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.NewsModel

class NewsMockDataSource{
    companion object {

        val News_1 = NewsModel("").apply {

        }

        val News_2 = NewsModel("").apply {

        }

        val News_3 = NewsModel("").apply {

        }


        val AllNewsList = mutableListOf(
                News_1,
                News_2,
                News_3,
                News_1,
                News_2,
                News_3,
                News_1,
                News_2,
                News_3,
                News_1,
                News_2,
                News_3
        )
    }
}
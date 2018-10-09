package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.PlainNewsModel

class NewsMockDataSource{
    companion object {

        val News_1 = PlainNewsModel().apply {
            ID = ""
            newsTitle = "Shot on iPhone XS: Users share their best"
            newsContent = "Users share their first photos shot on iPhone XS and iPhone XS Max on Twitter and Instagram."
            originNewsUrl = "https://www.apple.com/in/newsroom/2018/10/shot-on-iphone-xs-users-share-their-best/"
        }

        val News_2 = PlainNewsModel().apply {
            ID = ""
            newsTitle = "Everyone Can Create curriculum now available on Apple Books"
            newsContent = "Apple today announced its Everyone Can Create curriculum is now available on Apple Books. Designed to help unleash kids’ creativity throughout their school day, Everyone Can Create teaches students to develop and communicate ideas on iPad."
            originNewsUrl = "https://www.apple.com/in/newsroom/2018/10/everyone-can-create-curriculum-now-available-on-apple-books/"
        }

        val News_3 = PlainNewsModel().apply {
            ID = ""
            newsTitle = "macOS Mojave is available today"
            newsContent = "macOS Mojave, the latest version of the most advanced desktop operating system, is now available as a free software update for Mac users. macOS Mojave brings a number of n"
            originNewsUrl = "https://www.apple.com/in/newsroom/2018/09/macos-mojave-is-available-today/"
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
package com.inked_lab.inked.Views.MainTabController

import com.inked_lab.inked.Helpers.EnumCompanion

enum class MainTabType (val tabID: Int){

    Home(0),
    WatchList(1),
    Alert(2),
    More(3);

    companion object : EnumCompanion<Int, MainTabType>(MainTabType.values().associateBy(MainTabType::tabID))

}
package com.inked_lab.inked.Views.MainTabController

import com.inked_lab.inked.Helpers.EnumCompanion

enum class MainTabType (val tabID: Int){

    Home(0),
    WatchList(1),
    Calendar(2),
    Alert(3),
    More(4);

    companion object : EnumCompanion<Int, MainTabType>(MainTabType.values().associateBy(MainTabType::tabID))

}
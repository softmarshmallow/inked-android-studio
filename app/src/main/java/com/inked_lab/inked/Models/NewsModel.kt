package com.inked_lab.inked.Models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class NewsModel(open val ID: String) : RealmObject() {
    var newsTitle: String = ""
    var newsContent: String = ""
    var originNewsUrl: String = ""
}


class AnalyzedNewsModel(override val ID:String): NewsModel(ID) {

    var realtedCompanies: MutableList<String> = mutableListOf()

}
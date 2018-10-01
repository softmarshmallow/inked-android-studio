package com.inked_lab.inked.Models

import com.inked_lab.inked.InkedApplication.Companion.context
import com.inked_lab.inked.R
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class NewsModel(open val ID: String) : RealmObject() {
    var newsTitle: String = context!!.getString(R.string.dummy_title_cicero)
    var newsContent: String = context!!.getString(R.string.dummy_content_lorem)
    var originNewsUrl: String = "http://example.com/"
    var thumbnailUrl: String = "https://picsum.photos/200/"
}


class AnalyzedNewsModel(override val ID:String): NewsModel(ID) {

    var realtedCompanies: MutableList<String> = mutableListOf()

}
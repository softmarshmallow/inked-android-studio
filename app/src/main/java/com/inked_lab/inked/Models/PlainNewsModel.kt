package com.inked_lab.inked.Models

import com.inked_lab.inked.InkedApplication.Companion.context
import com.inked_lab.inked.R

open class PlainNewsModel() {
    lateinit var ID: String
    var newsTitle: String = context!!.getString(R.string.dummy_title_cicero)
    var newsContent: String = context!!.getString(R.string.dummy_content_lorem)
    var originNewsUrl: String = "http://example.com/"
    var thumbnailUrl: String = "https://picsum.photos/200/"
    var publisher: String = "XX일보"
}



open class TaggedNewsModel: PlainNewsModel(){
    var products = mutableListOf<String>()
    var peoples = mutableListOf<String>()
    var companies = mutableListOf<String>()
    var primaryCompany :String = ""
}

class AnalyzedNewsModel: TaggedNewsModel() {

    var relatedNews: MutableList<AnalyzedNewsModel> = mutableListOf()
    var relatedIncidents: MutableList<AnalyzedIncidentModel> = mutableListOf()

}


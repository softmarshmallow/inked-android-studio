package com.inked_lab.inked.Views.PlainNewsListView

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inked_lab.inked.Models.PlainNewsModel
import com.inked_lab.inked.R
import kotlinx.android.synthetic.main.card_news_item.view.*

class PlainNewsRecyclerAdapter constructor(val context: Context, val items: List<PlainNewsModel>, val listener: (PlainNewsModel) -> Unit): RecyclerView.Adapter<PlainNewsRecyclerAdapter.PlainNewsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlainNewsViewHolder
            = PlainNewsRecyclerAdapter.PlainNewsViewHolder(LayoutInflater.from(context).inflate(R.layout.card_news_item, parent, false))


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PlainNewsViewHolder, position: Int)  = holder.bind(items[position], listener)

    class PlainNewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: PlainNewsModel, listener: (PlainNewsModel) -> Unit){

            itemView.newsTitleTextView.text = item.newsTitle
            itemView.newsContentTextView.text = item.newsContent

            itemView.setOnClickListener { listener(item) }
        }

    }
}
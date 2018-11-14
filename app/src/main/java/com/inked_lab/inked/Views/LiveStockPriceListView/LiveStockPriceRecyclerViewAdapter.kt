package com.inked_lab.inked.Views.LiveStockPriceListView

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inked_lab.inked.CustomViews.LiveStockPriceView
import com.inked_lab.inked.Models.AlertModel
import com.inked_lab.inked.R

class LiveStockPriceRecyclerViewAdapter constructor(val context: Context, val items: List<String>, val listener: (String) -> Unit) : RecyclerView.Adapter<LiveStockPriceRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, index: Int): ViewHolder
            = ViewHolder(LayoutInflater.from(context).inflate(R.layout.customview_live_stock_price, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(viewHolder: ViewHolder, index: Int) {
        val data = items[index]
        viewHolder.bindView(data)
    }


    class ViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        private var liveStockPriceView: LiveStockPriceView

        init {
            liveStockPriceView = itemView as LiveStockPriceView
        }

        fun getLiveStockPriceView(): LiveStockPriceView {
            return liveStockPriceView
        }

        fun bindView(data: String){
            liveStockPriceView.companyCode = data
        }
    }
}
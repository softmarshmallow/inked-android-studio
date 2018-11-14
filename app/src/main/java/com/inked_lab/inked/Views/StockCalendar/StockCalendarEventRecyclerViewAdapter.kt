package com.inked_lab.inked.Views.StockCalendar

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.inked_lab.inked.CustomViews.LiveStockPriceView
import com.inked_lab.inked.Models.StockCalendarEventModel
import com.inked_lab.inked.R
import com.inked_lab.inked.R.id.*
import kotlinx.android.synthetic.main.card_stock_calendar_item.*

import com.inked_lab.inked.Views.IncidentDetailView.IncidentDetailActivity

class StockCalendarEventRecyclerViewAdapter(val context: Context, val items: List<StockCalendarEventModel>, val listener: (StockCalendarEventModel) -> Unit): RecyclerView.Adapter<StockCalendarEventRecyclerViewAdapter.StockCalendarEventViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockCalendarEventViewHolder =
            StockCalendarEventViewHolder(LayoutInflater.from(context).inflate(R.layout.card_stock_calendar_item, parent, false), context)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: StockCalendarEventViewHolder, position: Int) = holder.bind(items[position], listener)

    class StockCalendarEventViewHolder(itemView: View, context: Context): RecyclerView.ViewHolder(itemView) {
        var data: StockCalendarEventModel? = null
        lateinit var listener: (StockCalendarEventModel) -> Unit
        init {
            itemView.setOnClickListener {
                data?.let { it1 -> IncidentDetailActivity.Companion.StartActivity(context, it1) }
            }
        }
        fun bind(data: StockCalendarEventModel, listener: (StockCalendarEventModel) -> Unit){
            this.data = data
            this.listener =  listener


            itemView.findViewById<TextView>(incidentNameTextView).text = data.eventName
            itemView.findViewById<TextView>(incidentTimeTextView).text = "today"
            itemView.findViewById<TextView>(incidentContentTextView).text = data.incidentContent
            itemView.findViewById<LiveStockPriceView>(incidentCompanyPriceView).companyCode = data.primaryCompany.companyCode

        }
    }
}



/*
*
*
class AlertsRecyclerAdapter constructor(val context: Context, val items: List<AlertModel>, val listener: (AlertModel) -> Unit): RecyclerView.Adapter<AlertsRecyclerAdapter.AlertsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertsViewHolder
            = AlertsViewHolder(LayoutInflater.from(context).inflate(R.layout.card_alert_item, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AlertsViewHolder, position: Int) = holder.bind(items[position], listener)

    class AlertsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: AlertModel, listener: (AlertModel) -> Unit) = with(itemView) {
            AlertTitleTextView.text = "Nothing to display"
            AlertContentTextView.text = item.content
            setOnClickListener { listener(item) }
        }
    }

}

*
* */
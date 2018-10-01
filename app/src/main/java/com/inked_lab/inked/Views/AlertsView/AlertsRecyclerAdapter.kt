package com.inked_lab.inked.Views.AlertsView

import android.content.Context
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inked_lab.inked.Models.AlertModel
import com.inked_lab.inked.R
import kotlinx.android.synthetic.main.card_alert_item.view.*

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




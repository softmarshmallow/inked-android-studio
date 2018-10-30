package com.inked_lab.inked.Views.StockCalendar

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inked_lab.inked.R
import kotlinx.android.synthetic.main.fragment_stock_calendar.*

class StockCalendarFragment : Fragment() {

    companion object {
        fun newInstance() = StockCalendarFragment()
    }

    private lateinit var viewModel: StockCalendarViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_stock_calendar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StockCalendarViewModel::class.java)
        initUI()
    }

    private fun initUI(){
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val value = viewModel.getCalanderEventList().value!!
        stockCalendarEventRecyclerView.adapter = StockCalendarEventRecyclerViewAdapter(items=value, context = context!!, listener = {

        })
        stockCalendarEventRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

}

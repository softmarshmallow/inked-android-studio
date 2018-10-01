package com.inked_lab.inked.Views.StockCalendar

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inked_lab.inked.Views.StockCalendar.R

class StockCalendarFragment : Fragment() {

    companion object {
        fun newInstance() = StockCalendarFragment()
    }

    private lateinit var viewModel: StockCalendarViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.stock_calendar_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StockCalendarViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

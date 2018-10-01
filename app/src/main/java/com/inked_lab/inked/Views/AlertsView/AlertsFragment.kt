package com.inked_lab.inked.Views.AlertsView

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.inked_lab.inked.Models.AlertModel

import com.inked_lab.inked.R
import com.inked_lab.inked.Utils.InjectorUtils
import kotlinx.android.synthetic.main.fragment_alerts.*

class AlertsFragment : Fragment() {

    companion object {
        fun newInstance() = AlertsFragment()
    }

    lateinit var alertsRecyclerAdapter: AlertsRecyclerAdapter
    private lateinit var viewModel: AlertsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_alerts, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeUi()
    }

    private fun initializeUi() {
        // Get the QuotesViewModelFactory with all of it's dependencies constructed
        val factory = InjectorUtils.provideAlertsViewModelFactory()
        // Use ViewModelProviders class to create / get already created QuotesViewModel
        // for this view (activity)
        viewModel = ViewModelProviders.of(this, factory)
                .get(AlertsViewModel::class.java)

        // Observing LiveData from the AlertsViewModel which in turn observes
        // LiveData from the repository, which observes LiveData from the DAO ☺
        alertsRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        viewModel.getAlerts().observe(this, Observer { alerts ->
            alertsRecyclerAdapter = AlertsRecyclerAdapter(this.activity!!, alerts!!) { onAlertItemClick(it) }
            alertsRecyclerView.adapter = alertsRecyclerAdapter

        })

    }


    fun onAlertItemClick(item: AlertModel){
        Toast.makeText(activity, "${item.time}", Toast.LENGTH_SHORT)
    }



}

package com.inked_lab.inked.Views.AlertsView

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.inked_lab.inked.R

class AlertsFragment : Fragment() {

    companion object {
        fun newInstance() = AlertsFragment()
    }

    private lateinit var viewModel: AlertsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.alerts_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AlertsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

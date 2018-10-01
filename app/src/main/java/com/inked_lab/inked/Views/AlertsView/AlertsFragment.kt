package com.inked_lab.inked.Views.AlertsView

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.inked_lab.inked.R
import com.inked_lab.inked.Utils.InjectorUtils
import kotlinx.android.synthetic.main.alerts_fragment.*

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
        initializeUi()
    }

    private fun initializeUi() {
        // Get the QuotesViewModelFactory with all of it's dependencies constructed
        val factory = InjectorUtils.provideAlertsViewModelFactory()
        // Use ViewModelProviders class to create / get already created QuotesViewModel
        // for this view (activity)
        viewModel = ViewModelProviders.of(this, factory)
                .get(AlertsViewModel::class.java)

        // Observing LiveData from the QuotesViewModel which in turn observes
        // LiveData from the repository, which observes LiveData from the DAO ☺
        viewModel.getAlerts().observe(this, Observer { alerts ->
            val stringBuilder = StringBuilder()
            alerts!!.forEach { alert ->
                stringBuilder.append("$alert\n\n")
            }
            alertTestText.text = stringBuilder.toString()
        })

        // When button is clicked, instantiate a Quote and add it to DB through the ViewModel
//        button_add_quote.setOnClickListener {
//            val quote = AlertModel(editText_quote.text.toString(), editText_author.text.toString())
//            viewModel.addQuote(quote)
//            editText_quote.setText("")
//            editText_author.setText("")
//        }
    }


}

package com.inked_lab.inked.Views.PlainNewsListView

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.inked_lab.inked.R

class PlainNewsListFragment : Fragment() {

    companion object {
        fun newInstance() = PlainNewsListFragment()
    }

    private lateinit var viewModel: PlainNewsListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_plain_news_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PlainNewsListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

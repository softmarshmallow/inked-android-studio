package com.inked_lab.inked.Views.WatchListView

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.inked_lab.inked.R

class WatchListFragment : Fragment() {

    companion object {
        fun newInstance() = WatchListFragment()
    }

    private lateinit var viewModel: WatchListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.watch_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WatchListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

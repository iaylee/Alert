package com.trimentoring.alert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.trimentoring.alert.databinding.FragmentAlertListBinding

class AlertListFragment : Fragment() {

    private val binding: FragmentAlertListBinding by lazy {
        FragmentAlertListBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    companion object {

        fun newFragment() = AlertListFragment()
    }
}
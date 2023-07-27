package com.adrian.ec3.santiago.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adrian.ec3.santiago.R
import com.adrian.ec3.santiago.databinding.FragmentYugiFavoriteBinding


class YugiFavoriteFragment : Fragment() {

    private lateinit var binding: FragmentYugiFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentYugiFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

}
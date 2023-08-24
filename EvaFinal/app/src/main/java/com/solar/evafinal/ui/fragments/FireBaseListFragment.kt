package com.solar.evafinal.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.solar.evafinal.R
import com.solar.evafinal.databinding.FragmentApiListBinding
import com.solar.evafinal.databinding.FragmentFireBaseListBinding

class FireBaseListFragment : Fragment() {

    private lateinit var binding: FragmentFireBaseListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFireBaseListBinding.inflate(inflater, container, false)
        return binding.root
    }

}
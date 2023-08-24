package com.solar.evafinal.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.solar.evafinal.adapter.CountryAdapter
import com.solar.evafinal.data.viewmodel.CountryViewModel
import com.solar.evafinal.databinding.FragmentApiListBinding

class ApiListFragment : Fragment() {

    private lateinit var binding: FragmentApiListBinding
    private lateinit var viewModel: CountryViewModel
    private lateinit var adapter: CountryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentApiListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializa el ViewModel
        viewModel = ViewModelProvider(this).get(CountryViewModel::class.java)

        // Configura el RecyclerView
        setupRecyclerView()

        // Obtiene y observa la lista de países
        viewModel.getCountries()

        viewModel.getCountries.observe(viewLifecycleOwner) { countries ->
            adapter.getCountries = countries
            adapter.notifyDataSetChanged()
        }
    }

    private fun setupRecyclerView() {
        binding.rvApiList.layoutManager = GridLayoutManager(requireContext(), 3)
        adapter = CountryAdapter(requireContext(), arrayListOf())
        binding.rvApiList.adapter = adapter
    }
}

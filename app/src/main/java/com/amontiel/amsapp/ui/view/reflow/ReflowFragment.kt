package com.amontiel.amsapp.ui.view.reflow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.amontiel.amsapp.R
import com.amontiel.amsapp.ui.viewmodel.ReflowViewModel
import androidx.databinding.DataBindingUtil
import com.amontiel.amsapp.databinding.FragmentReflowBinding

class ReflowFragment : Fragment() {

    private var _binding: FragmentReflowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val reflowViewModel =
            ViewModelProvider(this).get(ReflowViewModel::class.java)

        // Usar Data Binding para inflar el layout y vincular el ViewModel
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_reflow, container, false)
        _binding?.viewModel = reflowViewModel
        _binding?.lifecycleOwner = viewLifecycleOwner

        // Usar View Binding para acceder a otras vistas si es necesario
        // Ejemplo: binding.textReflow.text = "Texto con View Binding"

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

package com.amontiel.amsapp.ui.view.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.amontiel.amsapp.R
import com.amontiel.amsapp.databinding.FragmentSettingsBinding
import com.amontiel.amsapp.ui.viewmodel.ReflowViewModel
import com.amontiel.amsapp.ui.viewmodel.SettingsViewModel

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val settingsViewModel =
            ViewModelProvider(this).get(SettingsViewModel::class.java)

        // Usar Data Binding para inflar el layout y vincular el ViewModel
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)
        _binding?.viewModel = settingsViewModel
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
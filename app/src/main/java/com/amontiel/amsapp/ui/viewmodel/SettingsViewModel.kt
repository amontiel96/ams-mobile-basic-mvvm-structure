package com.amontiel.amsapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is settings Fragment"
    }
    val text: LiveData<String> = _text

    // Método para actualizar el valor de _text
    fun updateText(newText: String) {
        _text.value = newText
    }

    val editEmail = MutableLiveData<String>("")
}
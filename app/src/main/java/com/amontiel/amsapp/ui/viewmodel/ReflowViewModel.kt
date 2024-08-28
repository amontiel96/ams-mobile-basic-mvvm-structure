package com.amontiel.amsapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReflowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is reflow Fragment"
    }
    val text: LiveData<String> = _text

    val txtReflowTitle = MutableLiveData<String>().apply { value = "valor inicial desde el view model" }
}
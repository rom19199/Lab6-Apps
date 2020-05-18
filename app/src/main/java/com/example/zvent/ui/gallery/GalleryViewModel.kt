package com.example.zvent.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Zvent es una aplicación en donde usted puede llevar el registro de n invitados de la activad que usted desee"
    }
    val text: LiveData<String> = _text
}
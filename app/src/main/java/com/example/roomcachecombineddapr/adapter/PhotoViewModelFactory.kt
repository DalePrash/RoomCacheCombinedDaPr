package com.example.newspagingdapr.photopagethree

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PhotoViewModelFactory(private val apiInterPhoto: ApiInterPhoto): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PhotoViewModel::class.java)){
        return PhotoViewModel(apiInterPhoto) as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
}}

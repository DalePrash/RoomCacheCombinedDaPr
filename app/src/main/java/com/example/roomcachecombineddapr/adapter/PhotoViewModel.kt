package com.example.newspagingdapr.photopagethree

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn

public class PhotoViewModel(private val api: ApiInterPhoto):ViewModel() {
    val photoList = Pager(PagingConfig(pageSize=100)){
        PhotoDataSource(api)
    }.flow.cachedIn(viewModelScope)

}
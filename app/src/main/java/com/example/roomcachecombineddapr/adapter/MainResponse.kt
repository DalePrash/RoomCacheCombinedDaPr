package com.example.newspagingdapr.photopagethree

import com.example.roomcachecombineddapr.Pojo

data class MainResponse (
    val hits: List<Pojo>,
            val total : Int,
                    val totalHits: Int

)
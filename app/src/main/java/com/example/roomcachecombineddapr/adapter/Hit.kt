package com.example.newspagingdapr.photopagethree
import com.google.gson.annotations.SerializedName

data class Hit (@SerializedName("ad")val title: String,var key: Int,  val imgUrl:Int
                ,     var  id: Long
)
/*
data class Hit (@SerializedName("ad")val title: String,var key: Int,  val imgUrl:Int,
                var  id: Long
)
 */
package com.example.newspagingdapr.photopagethree


import com.example.roomcachecombineddapr.Pojo
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
public interface ApiInterPhoto {

    @GET("api/")
  suspend  fun getNewsXx(
        @Query("page") page: Int,
        @Query("pageSize") key: String = "20045329-0613298a4e814661c692a9f03"
    ): Response<MainResponse>


    @GET("550?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
   suspend fun getTopRatedMovie() : MainResponse


    @GET("550?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
    suspend fun getTopRatedMoviexs() : Response<MainResponse>


    @GET("550?api_key=b199eab06bc931ed71cd20c95e4b2bb3")
   suspend fun getTopRatedMovieXX(): Call<Pojo>
// ??? susupend


    companion object{
        fun getXAPi()
            = Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/movie/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
               // .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            .create(ApiInterPhoto::class.java)
/*
  .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
 */


        //     .create(ApiInterPhoto.javaClass) ???/ this was crime

        }

    }
//  https://pixabay.com/api/?page=2&key=20045329-0613298a4e814661c692a9f03

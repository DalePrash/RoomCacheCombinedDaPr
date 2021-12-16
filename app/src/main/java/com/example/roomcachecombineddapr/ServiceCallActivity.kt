package com.example.roomcachecombineddapr

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newspagingdapr.photopagethree.ApiInterPhoto
import com.example.newspagingdapr.photopagethree.PhotoViewModel
import com.example.newspagingdapr.photopagethree.PhotoViewModelFactory
import com.example.pagingthreedapr.photopagethree.PhotoAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

public class ServiceCallActivity : AppCompatActivity() {


 /*   private val button1 : Button by lazy{
        findViewById(R.id.buttonA) as Button
    }

  */

    lateinit var viewModel: PhotoViewModel
    lateinit var mainListAdapter: PhotoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        //  setContentView(R.layout.ac)
        mainListAdapter = PhotoAdapter()

        setUI()
        viewModel = ViewModelProvider(this,
            PhotoViewModelFactory(ApiInterPhoto.getXAPi())
        )[PhotoViewModel::class.java]

        CoroutineScope(Dispatchers.IO).launch{
 viewModel.photoList.collect {
                mainListAdapter.submitData(it)
        }


        // can only be called from    lifecyclescope

     /*
        lifecycleScope.launch {


            }


      */


         /*   button1.setOnClickListener(View.OnClickListener {
                val intent = Intent()
                intent.action = "second"
                startActivity(intent)
            })

          */
        //    val apiService = APICl.getClient().create(NetServe::class.java)
          //  val call = apiService.topRatedMovies

       //     val networkService = ApiInterPhoto.getXAPi()
       //     val call = networkService.getTopRatedMovie()


/*
            call.enqueue(object : Callback<Pojo?> {
                override fun onResponse(call: Call<Pojo?>, response: Response<Pojo?>) {
                    Log.i("a", "a")
             /*       val thread: Thread = object : Thread() {
                        override fun run() {
                            val md = MovieDataBase.getDatabase(this@ServiceCallActivity)
                            val mdao = md.movieAbs()
                            mdao.insert(response.body())
                            Log.i("a", "a")
                        }
                    }
                    thread.start()


              */
                }
                override fun onFailure(call: Call<Pojo?>, t: Throwable) {
                    Log.i("a", "a")
                }
            })


 */
        }

    }



    private fun setUI() {
        val rv = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recycler_view_service)
        rv.apply {
            layoutManager = LinearLayoutManager(this@ServiceCallActivity)
        //    setHasFixedSize(true)
            adapter = mainListAdapter
        }




    }

    }




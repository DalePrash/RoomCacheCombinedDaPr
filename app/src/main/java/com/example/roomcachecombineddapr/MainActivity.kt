package com.example.roomcachecombineddapr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newspagingdapr.photopagethree.ApiInterPhoto
import com.example.newspagingdapr.photopagethree.PhotoViewModel
import com.example.newspagingdapr.photopagethree.PhotoViewModelFactory
import com.example.pagingthreedapr.photopagethree.PhotoAdapter
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

public class MainActivity: AppCompatActivity() {
    /*
    lateinit var viewModel: PhotoViewModel
    lateinit var mainListAdapter: PhotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //    var viewModel: PhotoViewModel = ViewModelProviders.of(this).get(PhotoViewModel::class.java)

        viewModel = ViewModelProvider(this,
            PhotoViewModelFactory(ApiInterPhoto.getXAPi())
        )[PhotoViewModel::class.java]
        //    viewModel = ViewModelProvider(this,PhotoViewModelFactory(ApiInterPhoto.getXAPi())
        //     viewModel = ViewModelProvider(this,PhotoViewModelFactory(ApiInterPhoto.getXAPi())[PhotoViewModel::class.java]

        mainListAdapter = PhotoAdapter()
        lifecycleScope.launch {

            viewModel.photoList.collect {
                mainListAdapter.submitData(it)
            }
        }

        setupView()
        setUI()

        /*  setupViewModel()
          setupList()
          setupView()

         */
    }

    // @InternalCoroutinesApi
    fun setupView() {
        lifecycleScope.launch {
            viewModel.photoList.collect{
                mainListAdapter.submitData(it)
            }
        }
    }

    /* private fun setupList() {
         mainListAdapter = PhotoAdapter()
         recyclerView.apply {
             layoutManager = LinearLayoutManager(this)
             adapter = mainListAdapter
         }
     }

     */


    private fun setUI() {
        val  rv = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recycler_view)
        rv.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = mainListAdapter
        }

    }
    /*private fun setupViewModel() {
       viewModel =
           ViewModelProvider(
               this,
               MainViewModelFactory(APIService.getApiService())
           )[MainViewModel::class.java]

     */

     */
}



// Main link   https://blog.mindorks.com/paging-3-tutorial

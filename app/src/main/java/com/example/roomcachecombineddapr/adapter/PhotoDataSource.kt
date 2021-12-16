package com.example.newspagingdapr.photopagethree
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PageKeyedDataSource
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.roomcachecombineddapr.Pojo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

public class PhotoDataSource(private val  api: ApiInterPhoto) : PagingSource<Int, Pojo>() {

    val responseList = mutableListOf<Pojo>()
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Pojo> {
    //    TODO("Not yet implemented")
        val currentPageList : Int = params.key?:1
    // below is for photo
      //  val response = api.getNewsXx(currentPageList)
 //api.g

        CoroutineScope(Dispatchers.IO).launch {

            val response = api.getTopRatedMovie()



            val data = response.hits
            //  val data = response.body()?.hits?: emptyList()
            //  val  data = response.body()
            responseList.addAll(data)
        }
            val pervkrey = if (currentPageList == 1) null else currentPageList - 1
            return LoadResult.Page(responseList, pervkrey, currentPageList.plus(1))

    }

    /*@ExperimentalPagingApi
    override fun getRefreshKey(state: PagingState<Int, Hit>): Int? {
        return super.getRefreshKey(state)
    }

     */

    @ExperimentalPagingApi
    override fun getRefreshKey(state: PagingState<Int, Pojo>): Int? {
     //   TODO("Not yet implemented")
       // return super.getRefreshKey(state)
        return state.anchorPosition

    }
}
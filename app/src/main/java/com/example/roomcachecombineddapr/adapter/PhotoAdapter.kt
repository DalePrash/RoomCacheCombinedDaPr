package com.example.pagingthreedapr.photopagethree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.roomcachecombineddapr.Pojo
import com.example.roomcachecombineddapr.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_sub_photo.view.*

public class PhotoAdapter:PagingDataAdapter<Pojo,PhotoAdapter.ViewHolder>(DataDiff) {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

   object DataDiff: DiffUtil.ItemCallback<Pojo>() {
       override fun areItemsTheSame(oldItem: Pojo, newItem: Pojo): Boolean {
           TODO("Not yet implemented")
           return oldItem.id == newItem.id
       }

       override fun areContentsTheSame(oldItem: Pojo, newItem: Pojo): Boolean {
           TODO("Not yet implemented")
           return oldItem == newItem

       }
   }

    override fun onBindViewHolder(holder: PhotoAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
  //      holder.itemView.textA.text =
   //         "${getItem(position)?.firstName} ${getItem(position)?.lastName}"
 //       holder.itemView.textViewEmail.text = getItem(position)?.email
        val textA: TextView = holder.itemView.findViewById(R.id.textMovie)
        holder.itemView.textMovie.text =getItem(position)?.original_title

        val textB: TextView = holder.itemView.findViewById(R.id.textLanguage)
        holder.itemView.textLanguage.text =getItem(position)?.original_language

        val textC: TextView = holder.itemView.findViewById(R.id.textId)
        holder.itemView.textId.text =getItem(position)?.id.toString()


    /*    val imageX: ImageView = holder.itemView.findViewById(R.id.textLanguage)
        Picasso.get().load(getItem(position)!!.imgUrl).into(imageX)

     */

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter.ViewHolder {
        TODO("Not yet implemented")
        return ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.activity_sub_photo, parent, false))
    }
}
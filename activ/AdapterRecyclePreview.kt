package com.example.latihanresponsizaedar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclePreview(val context : Context, val datapreview : ArrayList<dataRecyclePreview>) : RecyclerView.Adapter<AdapterRecyclePreview.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.fetch_preview,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = datapreview [position]


        holder.imagePreview.setImageResource(currentItem.image)

    }

    override fun getItemCount(): Int {
        return datapreview.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imagePreview : ImageView = itemView.findViewById(R.id.photoPreview)

    }

}
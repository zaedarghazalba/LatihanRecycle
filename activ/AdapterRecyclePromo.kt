package com.example.latihanresponsizaedar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclePromo(val context : Context, val datapromo : ArrayList<dataRecyclePromo>) : RecyclerView.Adapter<AdapterRecyclePromo.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.fetch_promo,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = datapromo [position]


        holder.imageitem.setImageResource(currentItem.image)
        holder.namaitem.text = currentItem.namaItem
        holder.piecesss.text = currentItem.pieces
        holder.hargaitem.text = currentItem.harga
        holder.diskonitem.text = currentItem.diskon

    }

    override fun getItemCount(): Int {
        return datapromo.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imageitem : ImageView = itemView.findViewById(R.id.imageItemPromo)
        val namaitem : TextView = itemView.findViewById(R.id.text1)
        val piecesss : TextView = itemView.findViewById(R.id.text2)
        val hargaitem : TextView = itemView.findViewById(R.id.text3)
        val diskonitem : TextView = itemView.findViewById(R.id.text4)


    }

}
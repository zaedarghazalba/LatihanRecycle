package com.example.latihanresponsizaedar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycleMember(val context : Context, val datamember : ArrayList<dataRecycleMember>) : RecyclerView.Adapter<AdapterRecycleMember.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.fetch_member,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = datamember [position]


        holder.imageitem1.setImageResource(currentItem.image1)
        holder.namaitem1.text = currentItem.namaItem1
        holder.diskon1.text = currentItem.hargadiskon1
        holder.hargaitem1.text = currentItem.harga1
        holder.total1.text = currentItem.total1
    }
    override fun getItemCount(): Int {
        return datamember.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imageitem1 : ImageView = itemView.findViewById(R.id.img_person1)
        val namaitem1 : TextView = itemView.findViewById(R.id.text1)
        val diskon1 : TextView = itemView.findViewById(R.id.text2)
        val hargaitem1 : TextView = itemView.findViewById(R.id.text3)
        val total1 : TextView = itemView.findViewById(R.id.text4)
    }

}
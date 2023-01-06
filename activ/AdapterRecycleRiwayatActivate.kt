package com.example.latihanresponsizaedar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycleRiwayatActivate(val context : Context, val datariwayatactivate : ArrayList<dataRecycleRiwayatActivate>) : RecyclerView.Adapter<AdapterRecycleRiwayatActivate.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.fetch_riwayatactivate,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = datariwayatactivate [position]

        holder.tanggal.text = currentItem.tanggal
        holder.invoice.text = currentItem.invoice
        holder.total.text = currentItem.total


    }

    override fun getItemCount(): Int {
        return datariwayatactivate.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val tanggal : TextView = itemView.findViewById(R.id.textTanggal)
        val invoice : TextView = itemView.findViewById(R.id.textInvoice)
        val total : TextView = itemView.findViewById(R.id.textTotalbayar)



    }

}
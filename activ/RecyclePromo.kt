package com.example.latihanresponsizaedar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclePromo : AppCompatActivity() {
    //variable untuk recycler view
    private lateinit var recyclerView: RecyclerView

    // variable untuk data userlist
    private lateinit var dataUserList: ArrayList<dataRecyclePromo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_promo)
        // inisialisasi image to member
        var gotoMemberrr: TextView = findViewById(R.id.gotoMember)


        //inisialisasi recycler view
        recyclerView = findViewById(R.id.recyclePromo)

        //inisialisasi data user
        dataUserList = ArrayList<dataRecyclePromo>()

        //data dummy example
        val image = arrayOf(
            R.drawable.img_promo_person,
            R.drawable.img_promo_person,
            R.drawable.img_promo_person,
            R.drawable.img_promo_person
        )
        val namaitem = arrayOf(
            "Baju lebaran",
            "Jaket Alan Walker",
            "Jubah Arab",
            "Hoodie Naruto"
        )
        val pieces = arrayOf(
            "7 Pieces",
            "3 Pieces",
            "5 Pieces",
            "9 Pieces"
        )
        val harga = arrayOf(
            "Rp 400.000",
            "Rp 400.000",
            "Rp 400.000",
            "Rp 400.000"
        )
        val diskon = arrayOf(
            "Rp 200.000",
            "Rp 200.000",
            "Rp 200.000",
            "Rp 200.000"

        )


        for (i in image.indices) {
            dataUserList.add(
                dataRecyclePromo(
                    image[i],
                    namaitem[i],
                    pieces[i],
                    harga[i],
                    diskon[i]
                )
            )
            populateData()
        }
        gotoMemberrr = findViewById(R.id.gotoMember)

        gotoMemberrr.setOnClickListener(){
            val intent = Intent(this, RecyclerMemberGrid ::class.java)
            startActivity(intent)
        }
    }
    private fun populateData(){
        val linearManager = LinearLayoutManager(this)
        linearManager.reverseLayout = true
        linearManager.stackFromEnd = true
        recyclerView.layoutManager = linearManager
        val adp = AdapterRecyclePromo(this, dataUserList)
        recyclerView.adapter = adp
    }

}

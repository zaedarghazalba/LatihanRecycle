package com.example.latihanresponsizaedar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RiwayatActiveActivity : AppCompatActivity() {
    //variable untuk recycler view
    private lateinit var recyclerView: RecyclerView

    // variable untuk data userlist
    private lateinit var dataRiwayatList: ArrayList<dataRecycleRiwayatActivate>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_active)

        //inisialisasi recycler view
        recyclerView = findViewById(R.id.recycleRiwayatActivate)

        //inisialisasi data user
        dataRiwayatList = ArrayList<dataRecycleRiwayatActivate>()

        //data dummy example
        val tanggal = arrayOf(
            "28 OKTOBER 2020",
            "18 OKTOBER 2020",
            "1 DESEMBER 2002",
            "1 DESEMBER 2002"

        )
        val invoice = arrayOf(
            "INVOICE: 485415165451",
            "INVOICE: 254897846548",
            "INVOICE: 254897846548",
            "INVOICE: 214654875215"

        )
        val total = arrayOf(
            "Totalnya :Rp 400.000",
            "Totalnya :Rp 500.000",
            "Totalnya :Rp 600.000",
            "Totalnya :Rp 600.000"

        )
        for (i in tanggal.indices) {
            dataRiwayatList.add(
                dataRecycleRiwayatActivate(
                    tanggal[i],
                    invoice[i],
                    total[i]
                )
            )
            populateData()
        }
    }
    private fun populateData(){
        val linearManager = LinearLayoutManager(this)
        linearManager.reverseLayout = true
        linearManager.stackFromEnd = true
        recyclerView.layoutManager = linearManager
        val adp = AdapterRecycleRiwayatActivate(this, dataRiwayatList)
        recyclerView.adapter = adp
    }

}

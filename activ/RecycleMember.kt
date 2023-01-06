package com.example.latihanresponsizaedar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleMember : AppCompatActivity() {

    //variable untuk recycler view
    private lateinit var recyclerView: RecyclerView

    // variable untuk data userlist
    private lateinit var dataMemberList: ArrayList<dataRecycleMember>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_member)

        // inisialisasi image to member

        var gotoSettingggg: TextView = findViewById(R.id.gotoSetting)

        //inisialisasi recycler view

        recyclerView = findViewById(R.id.recycleMember)

        //inisialisasi data user
        dataMemberList = ArrayList<dataRecycleMember>()

        //data dummy example
        val image1 = arrayOf(
            R.drawable.img_member_person,
            R.drawable.img_member_person

        )
        val namaitem1 = arrayOf(
            "Baju lebaran",
            "Jaket Alan Walker"

        )
        val hargadiskon1 = arrayOf(
            "Rp 400.000",
            "Rp 500.000"

        )
        val harga1 = arrayOf(
            "Rp 200.000",
            "Rp 200.000"
        )
        val total1 = arrayOf(
            "Total Rp 200.000",
            "Total Rp 200.000"
        )
        val image2 = arrayOf(
            R.drawable.img_member_person,
            R.drawable.img_member_person
        )
        val namaitem2 = arrayOf(
            "Baju lebaran",
            "Jaket Alan Walker"
        )
        val hargadiskon2 = arrayOf(
            "Rp 400.000",
            "Rp 500.000"
        )
        val harga2 = arrayOf(
            "Rp 200.000",
            "Rp 200.000"
        )
        val total2 = arrayOf(
            "Total Rp 200.000",
            "Total Rp 200.000"
        )


        for (i in image1.indices) {
            dataMemberList.add(
                dataRecycleMember(
                    image1[i],
                    namaitem1[i],
                    hargadiskon1[i],
                    harga1[i],
                    total1[i]
//                    image2[i],
//                    namaitem2[i],
//                    hargadiskon2[i],
//                    harga2[i],
//                    total2[i]
                )
            )
            populateData()
        }
        gotoSettingggg = findViewById(R.id.gotoSetting)

        gotoSettingggg.setOnClickListener() {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
    }

    private fun populateData() {
        val linearManager = LinearLayoutManager(this)
        linearManager.reverseLayout = true
        linearManager.stackFromEnd = true
        recyclerView.layoutManager = linearManager
        val adp = AdapterRecycleMember(this, dataMemberList)
        recyclerView.adapter = adp
    }
}
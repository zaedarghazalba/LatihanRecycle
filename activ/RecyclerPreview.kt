package com.example.latihanresponsizaedar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerPreview : AppCompatActivity() {
    //variable untuk recycler view
    private lateinit var recyclerView: RecyclerView

    // variable untuk data userlist
    private lateinit var dataPreviewList: ArrayList<dataRecyclePreview>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_preview)
        // inisialisasi image to promo
        var gotoPromo: ImageView = findViewById(R.id.gotoPromo)

        //inisialisasi recycler view
        recyclerView = findViewById(R.id.recyclePreview)

        //inisialisasi data user
        dataPreviewList = ArrayList<dataRecyclePreview>()

        //data dummy example
        val image = arrayOf(
            R.drawable.img_preview1,
            R.drawable.img_preview2,
            R.drawable.img_preview3,
            R.drawable.img_preview4,

            )
        for (i in image.indices) {
            dataPreviewList.add(
                dataRecyclePreview(
                    image[i]
                )
            )
            populateData()


            gotoPromo.setOnClickListener{
                val intent = Intent(this, RecyclePromo ::class.java)
                startActivity(intent)
            }


        }
    }

    private fun populateData() {
        val linearManager = LinearLayoutManager(this)
        linearManager.reverseLayout = true
        linearManager.stackFromEnd = true
        recyclerView.layoutManager = linearManager
        val adp = AdapterRecyclePreview(this, dataPreviewList)
        recyclerView.adapter = adp
    }
}


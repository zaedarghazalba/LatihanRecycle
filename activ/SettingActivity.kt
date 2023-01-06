package com.example.latihanresponsizaedar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        // inisialisasi
        val EditProfile = findViewById(R.id.btnUbahProfile) as CardView
        val RiwayatActive = findViewById(R.id.btnRiwayatActivate) as CardView
        val tentangKami = findViewById(R.id.btnTentangKami) as CardView
        val DetailRiwayat = findViewById(R.id.btnDetailRiwayat) as CardView
        val Keluar = findViewById(R.id.btnKeluar) as CardView

        // fungsikan btn
        EditProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }
        tentangKami.setOnClickListener {
            val intent = Intent(this, TentangkamiActivity::class.java)
            startActivity(intent)
        }
        RiwayatActive.setOnClickListener {
            val intent = Intent(this, RiwayatActiveActivity::class.java)
            startActivity(intent)
        }
        DetailRiwayat.setOnClickListener {
            val intent = Intent(this, RecycleDetailRiwayat::class.java)
            startActivity(intent)
        }
        Keluar.setOnClickListener {
            finishAffinity()
        }
    }
}
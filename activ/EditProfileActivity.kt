package com.example.latihanresponsizaedar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView

class EditProfileActivity : AppCompatActivity() {
    private  lateinit var buttonedit : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        // inisialisasi

        buttonedit = findViewById(R.id.btnSimpanEdit)
        //event listener pada button
        buttonedit.setOnClickListener {
            //menampilkan toast dengan pesan
            Toast.makeText(this,"Update berhasil",Toast.LENGTH_SHORT).show()
        }




    }
}
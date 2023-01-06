package com.example.latihanresponsizaedar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var buttonPindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //declare ed
        var textEmailnya = findViewById(R.id.edEmailLogin) as EditText
        var textNamanya = findViewById(R.id.edPassLogin) as EditText
        var textRegist: TextView = findViewById(R.id.Registrasi)


        // inisialisasi
        buttonPindah = findViewById(R.id.btnLogin)


        // fungsikan text regist
        textRegist.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        // fungsikan ed
        buttonPindah.setOnClickListener {
            val email = textEmailnya.text;print(email)
            val nama = textNamanya.text;print(nama)
            val intent = Intent(this, RecyclerPreview::class.java)
            //intent.putExtra("username",values : "zaedar ghazalba") atau bisa seperti ini
            intent.putExtra("emailku", email.toString())
            intent.putExtra("namaku", nama.toString())
            //menampilkan toast dengan pesan
            Toast.makeText(this,"Login Berhasil", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }
    }
}
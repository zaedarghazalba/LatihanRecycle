package com.example.latihanresponsizaedar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    private lateinit var buttonPindah : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        //declare ed
//                var textNama = findViewById(R.id.edNamaRegister) as EditText
//        var textEmail = findViewById(R.id.edEmailRegister) as EditText
//         var textPass = findViewById(R.id.edPassRegister) as EditText
        var textLogin: TextView = findViewById(R.id.Logiiin)


        // inisialisasi
        buttonPindah = findViewById(R.id.btnDaftar)

        // fungsikan text on klick login
        textLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)}

//             fungsikan ed
        buttonPindah.setOnClickListener {
//            val nama = textNama.text;print(nama)
//            val email = textEmail.text;print(email)
//            val password = textPass.text;print(password)
            val intent = Intent(this, RecyclerPreview::class.java)
//            //intent.putExtra("username",values : zaedar ghazalba) atau bisa seperti ini
//            intent.putExtra("namaku", nama.toString())
//            intent.putExtra("emailku", email.toString())
//            intent.putExtra("passku", password.toString())
            //menampilkan toast dengan pesan
            Toast.makeText(this, "Daftar Berhasil", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }
    }
}
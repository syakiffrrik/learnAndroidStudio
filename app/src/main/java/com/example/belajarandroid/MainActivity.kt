package com.example.belajarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit: Button = findViewById(R.id.main_btn_submit)
        val etNama: EditText = findViewById(R.id.main_et_nama)
        val btnReset: ImageButton = findViewById(R.id.main_btn_reset)
        val cbCeklis: CheckBox = findViewById(R.id.main_btn_checkbox)
        val btnLogin: Button = findViewById(R.id.main_btn_login)

        btnSubmit.setOnClickListener {
            val namaPengguna = etNama.text.toString()

            if (cbCeklis.isChecked) {
                Toast.makeText(this, "Hai ${namaPengguna}", Toast.LENGTH_LONG).show()
                Log.d("submit", namaPengguna)

            } else {
                Toast.makeText(this, "Tolong di-klik", Toast.LENGTH_SHORT).show()
            }
        }
        btnReset.setOnClickListener {
            etNama.setText("")
        }

        btnLogin.setOnClickListener {
            val namaPengguna = etNama.text.toString()
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("nama", namaPengguna)
            startActivity(intent)
        }
    }
}
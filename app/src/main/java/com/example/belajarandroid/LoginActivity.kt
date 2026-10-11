package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.content.Intent

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvHalo: TextView = findViewById(R.id.login_tv_halo)
        val btnGoToMenu: Button = findViewById(R.id.btn_go_to_menu)

//        val dataNama = intent.getStringExtra("nama")
        val dataNama = "Selamat Datang, ${intent.getStringExtra("nama")}"
        if (!dataNama.isNullOrEmpty()) {
            tvHalo.text = dataNama
        }
        btnGoToMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
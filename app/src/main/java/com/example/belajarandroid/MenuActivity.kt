package com.example.belajarandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroid.adapters.MakananAdapter
import com.example.belajarandroid.adapters.MinumanAdapter
import com.example.belajarandroid.models.Makanan
import com.example.belajarandroid.models.Minuman

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val dataMakanan: List<Makanan> = listOf(
            Makanan("Rawon", 15000),
            Makanan("Bakwo",50000),
            Makanan("Mie Genit", 10000),
            Makanan("Ayam Penyet", 10000)
        )

        val dataMinuman: List<Minuman> = listOf(
            Minuman("Soda Gembira", 6000),
            Minuman("Kopi", 5000),
            Minuman("Teh Manis", 4000),
            Minuman("Es JoSu", 5000)
        )

        val recyclerMenu: RecyclerView = findViewById(R.id.rv_menu)
        val makananAdapter = MakananAdapter(dataMakanan)

        val recyclerMinuman: RecyclerView = findViewById(R.id.rv_minuman)
        val minumanAdapter = MinumanAdapter(dataMinuman)

        recyclerMenu.layoutManager = LinearLayoutManager(this)
        recyclerMenu.adapter = makananAdapter

        recyclerMinuman.layoutManager = LinearLayoutManager(this)
        recyclerMinuman.adapter = minumanAdapter
    }
}
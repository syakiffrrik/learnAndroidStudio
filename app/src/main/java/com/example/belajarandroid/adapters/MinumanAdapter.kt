package com.example.belajarandroid.adapters // Sesuaikan package Anda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroid.R
import com.example.belajarandroid.models.Minuman

class MinumanAdapter(val dataMinuman: List<Minuman>) : RecyclerView.Adapter<MinumanAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaMinuman: TextView = view.findViewById(R.id.tv_list_minuman_nama)
        val hargaMinuman: TextView = view.findViewById(R.id.tv_list_minuman_harga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_minuman, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val minuman = dataMinuman[position]
        holder.namaMinuman.text = minuman.namaMinuman
        holder.hargaMinuman.text = "Rp ${minuman.hargaMinuman}"
    }

    override fun getItemCount(): Int {
        return dataMinuman.size
    }
}
package com.example.belajarandroid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.belajarandroid.R
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroid.models.Makanan

class MakananAdapter (val dataMakanan: List<Makanan>): RecyclerView.Adapter<MakananAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaMakanan: TextView = view.findViewById(R.id.tv_list_makanan_nama)
        val hargaMakanan: TextView = view.findViewById(R.id.tv_list_makanan_harga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_makanan, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MakananAdapter.ViewHolder, position: Int) {
        holder.namaMakanan.text = dataMakanan[position].namaMakanan
//        holder.hargaMakanan.text = dataMakanan[position].hargaMakanan.toString()
        holder.hargaMakanan.text = "Rp ${dataMakanan[position].hargaMakanan}"
    }

    override fun getItemCount(): Int {
        return dataMakanan.count()
    }

}
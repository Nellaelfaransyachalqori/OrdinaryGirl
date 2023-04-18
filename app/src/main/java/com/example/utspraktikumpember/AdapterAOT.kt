package com.example.utspraktikumpember

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterAOT (private val ListAOT: ArrayList<DataAOT>, private val context: Context): RecyclerView.Adapter<AdapterAOT.CourseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterAOT.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_data_aot,
            parent, false
        )
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterAOT.CourseViewHolder, position: Int) {
        holder.nama.text =ListAOT.get(position).NamaAOT
        holder.nim.text =ListAOT.get(position).NimAOT
        holder.umur.text =ListAOT.get(position).UmurAOT
        holder.gambar.setImageResource(ListAOT.get(position).FotoAOT)
    }

    override fun getItemCount(): Int {
        return ListAOT.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.rvFoto)
        val nama: TextView = itemView.findViewById(R.id.rvNama)
        val nim: TextView = itemView.findViewById(R.id.rvNim)
        val umur: TextView = itemView.findViewById(R.id.rvUmur)
    }


}
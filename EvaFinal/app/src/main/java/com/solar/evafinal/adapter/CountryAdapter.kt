package com.solar.evafinal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.solar.evafinal.model.Country
import com.solar.evafinal.R

class CountryAdapter (
    val context: Context,
    var getCountries: List<Country>
): RecyclerView.Adapter<CountryAdapter.ViewHolder>() {
    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val cvPais = item.findViewById(R.id.cvPais) as CardView
        val ivPais = item.findViewById(R.id.ivPais) as ImageView
        val tvNomPais = item.findViewById(R.id.tvNomPais) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_paises, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pais = getCountries[position]
        Glide.with(context).load(pais.svg).centerInside().into(holder.ivPais)

        holder.tvNomPais.text = pais.common

    }

    override fun getItemCount(): Int {
        return getCountries.size
    }

}
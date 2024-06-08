package com.marisma.fase1recu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marisma.fase1recu.R
import com.marisma.fase1recu.Series

class SerieAdapter(
    private val seriesList: List<Series>,
    private val onClickListener: (Series) -> Unit
) : RecyclerView.Adapter<SeriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        // Inflate the layout for each item in the RecyclerView
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.itemseries, parent, false)
        return SeriesViewHolder(view)
    }

    override fun getItemCount(): Int = seriesList.size

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        // Bind the data to the ViewHolder
        holder.render(seriesList[position], onClickListener)
    }
}

package com.marisma.fase1recu.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marisma.fase1recu.Series
import com.marisma.fase1recu.databinding.ItemseriesBinding

class SeriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemseriesBinding.bind(view)

    fun render(series: Series, onClickListener: (Series) -> Unit) {
        // Set the series title
        binding.tvSeriesName.text = series.titulo
        // Set the series genre
        binding.tv2.text = series.genero
        // Set the series year
        binding.tvSeriesGenero.text = series.anio
        // Load the series image using Glide
        Glide.with(binding.ivSeries.context).load(series.foto).into(binding.ivSeries)

        // Set an onClickListener for the itemView
        itemView.setOnClickListener {
            onClickListener(series)
        }
    }
}

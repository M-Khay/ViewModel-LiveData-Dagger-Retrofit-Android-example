package com.example.viewmodellivedatadaggerretrofit.species

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodellivedatadaggerretrofit.R

class SpeciesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name by lazy { view.findViewById(R.id.name) as TextView }
    val classification by lazy { view.findViewById(R.id.classification) as TextView }
    val language by lazy { view.findViewById(R.id.language) as TextView }
    val lifeSpan by lazy { view.findViewById(R.id.lifeSpan) as TextView }
}
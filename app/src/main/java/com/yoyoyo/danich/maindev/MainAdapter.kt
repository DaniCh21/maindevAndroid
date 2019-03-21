package com.yoyoyo.danich.maindev

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*


class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val readyCountryListLabels = arrayListOf("Andorra", "Austria", "Bulgaria", "Cyprus", "Czech Republic", "Finland", "France", "Georgia", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Norway", "Poland", "Portugal", "Slovakia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom")

    override fun getItemCount(): Int {
        return readyCountryListLabels.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder{

        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val readyCountryListLabel = readyCountryListLabels.get(position)
        holder.view.countryLabelTv.text = readyCountryListLabel
    }
}



class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}


// arrayListOf("Andorra", "Austria", "Bulgaria", "Cyprus", "Czech Republic", "Finland", "France", "Georgia", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Norway", "Poland", "Portugal", "Slovakia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom")
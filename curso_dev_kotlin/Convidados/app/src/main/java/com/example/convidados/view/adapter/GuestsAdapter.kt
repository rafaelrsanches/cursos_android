package com.example.convidados.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.convidados.databinding.RowGuestBinding
import com.example.convidados.model.GuestModel
import com.example.convidados.view.viewholder.GuestsViewHolder

class GuestsAdapter : RecyclerView.Adapter<GuestsViewHolder>() {

    private var guestList: List<GuestModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestsViewHolder{
        val item = RowGuestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GuestsViewHolder(item)
    }

    override fun onBindViewHolder(holder: GuestsViewHolder, position: Int){
        holder.bind(guestList[position])
    }

    override fun getItemCount(): Int {
        return guestList.count()
    }

    fun updateGuests(list: List<GuestModel>){
        guestList = list
        notifyDataSetChanged()
    }

}
package com.example.convidados.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.convidados.databinding.RowGuestBinding
import com.example.convidados.model.GuestModel

class GuestsViewHolder(private val bind: RowGuestBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel){
        bind.textName.text = guest.name
    }

}
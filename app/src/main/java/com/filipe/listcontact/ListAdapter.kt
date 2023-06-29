package com.filipe.listcontact

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.filipe.listcontact.databinding.ItemBinding

class ListAdapter(
    val contacts: MutableList<ContactInfo>,
    val listener:ListAdapterListener
):RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(ItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
            )
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        var contato = contacts[position]
        holder.posicao.text = contato.phone
        holder.conteudo.text = contato.name



        holder.root.setOnClickListener {
            listener.onItemClicked(contato.name)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }



    class ListItemViewHolder(binding: ItemBinding):RecyclerView.ViewHolder(binding.root){

        var root = binding.root
        var posicao = binding.posicao
        var conteudo = binding.conteudo

    }

    interface ListAdapterListener{
        fun onItemClicked(content: String)
    }
}
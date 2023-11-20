package com.example.rv_sec1.Adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rv_sec1.R
import com.example.rv_sec1.model.Pokemon

class AdapterPokemon(val listaPokemon: List<Pokemon>) :
    RecyclerView.Adapter<AdapterPokemon.ViewHolder>() {

    //Paso 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            AdapterPokemon.ViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pokemon_rv, parent, false)
        return ViewHolder(vista)
    }


    //Paso 3
    override fun onBindViewHolder(holder: AdapterPokemon.ViewHolder, position: Int) {
        val pokemon = listaPokemon[position]

        holder.tvNombre.text = pokemon.Nombre
        holder.tvTipo.text = pokemon.Tipo
        holder.tvAtaque.text = pokemon.Ataque
        pokemon.Foto?.let {holder.ivPokemon.setImageResource(it)}
    }


    override fun getItemCount(): Int {
        return listaPokemon.size
    }

    //PAso 1
    //Identificar cada elemento del cardView
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        //Buscar cada id de la card
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvTipo: TextView = itemView.findViewById(R.id.tvTipo)
        val tvAtaque: TextView = itemView.findViewById(R.id.tvAtaque)
        val ivPokemon: ImageView = itemView.findViewById(R.id.ivPokemon)
    }


}
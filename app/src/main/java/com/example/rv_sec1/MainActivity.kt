package com.example.rv_sec1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rv_sec1.Adapter.AdapterPokemon
import com.example.rv_sec1.model.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Generar una lista con los pokemones que queremos mostrar en el RV
        val listPokemon = ArrayList<Pokemon>()

        listPokemon.add(Pokemon("Pikachu","Electrico","Ataque Rápido",R.drawable.pikachu))
        listPokemon.add(Pokemon("Charmander","Fuego","Ascuas",R.drawable.charmander))
        listPokemon.add(Pokemon("Raichu","Electrico","Impactrueno",R.drawable.raichu))
        listPokemon.add(Pokemon("Togepi","Hada","Confusión",R.drawable.togepi))
        listPokemon.add(Pokemon("Tauros","Normal","Ataque Rápido",R.drawable.tauros))
        listPokemon.add(Pokemon("Cyndaquil","Fuego","Placaje",R.drawable.cyndaquil))

        val rvPokemon = findViewById<RecyclerView>(R.id.rvPokemon)
        rvPokemon.layoutManager = LinearLayoutManager(this)

        val adapterPokemon = AdapterPokemon(listPokemon)
        rvPokemon.adapter = adapterPokemon


    }
}
package com.example.ejercicio_15_m5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.ejercicio_15_m5.databinding.ItemLayoutBinding

/*
[]Se crea la clase y se da herencia del recyclerView
[]class Adapter: RecyclerView.Adapter <Adapter.ViewHolder>(){}
[]luego se implementan los metodos de la clase Adapter,
[]crear class ViewHolder al final y dentro de la clase, hereda de la clase ViewHolder
[]constructor es el class viewholder
[]crear objeto dataclass
[]crear lista val pokemones= mutableListOf<Pokemon>()
[]asignar tamaño de la lista getItemCount
[]crear el binding  val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
[]pasar el binding al constructor cambiar view por binding
 class ViewHolder(binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {}

 */
class Adapter: RecyclerView.Adapter <Adapter.ViewHolder>(){
  var pokemones= mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemones[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
        this.pokemones = pokedex.toMutableList()

    }

    class ViewHolder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
           binding.textNombre.text = pokemon.nombre
            binding.textTipo.text = pokemon.tipo

        }

    }
}
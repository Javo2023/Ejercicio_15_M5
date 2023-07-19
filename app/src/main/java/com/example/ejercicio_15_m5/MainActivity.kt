package com.example.ejercicio_15_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio_15_m5.databinding.ActivityMainBinding

/*
Los pasos para crear un listado usando Recycler View
[x] item layout con un textView
    agregar constraint
    definir id
[x] layout en activity_main con el recyclerView, agregar constraint
    definir id

[X] Asignar layout manager en activity main (codigo)
    app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
[x] Adapter + view holder
[x] Obtener los datos

Pasar al adapter

[x]de vuelta se declara el binding
    lateinit var binding : ActivityMainBinding
[x]luego se implementa
    binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



 */
class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
    }

  private fun initAdapter(){
      val adapter= Adapter()
      val pokedex = Pokedex.getPokedex()
      adapter.setData(pokedex)

      binding.recyclerView.adapter=adapter

    }
}
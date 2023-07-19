package com.example.ejercicio_15_m5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
Los pasos para crear un listado usando Recycler View
[x] item layout con un textView
    agregar constraint
    definir id
[x] layout en activity_main con el recyclerView, agregar constraint
    definir id

[X] Asignar layout manager en activity main
    app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
[] Adapter + view holder
[] Obtener los datos

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
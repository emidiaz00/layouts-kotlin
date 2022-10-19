package com.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PantallaDosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_dos)

        val bundle = intent.extras
        val dato = bundle?.get("Datos")
        val envioRecibido = findViewById<TextView>(R.id.et_enviado)
        envioRecibido.text = "Escribiste: " + dato.toString()

        val boton2 = findViewById<Button>(R.id.btn_volver)
        boton2.setOnClickListener {
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }


    }
}
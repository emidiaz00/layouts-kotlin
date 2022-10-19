package com.example.layouts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt_envio = findViewById<EditText>(R.id.et_enviar)

        val boton1 = findViewById<Button>(R.id.btn_enviar)
        boton1.setOnClickListener {
            val enviar = Intent(this, PantallaDosActivity::class.java)
            enviar.putExtra("Datos", txt_envio.text.toString())
            startActivity(enviar)
        }
    }
}

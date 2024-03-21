package com.example.primeraaplicacinsaludo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val texName = findViewById<EditText>(R.id.texName)
        val texSaludo = findViewById<TextView>(R.id.texSaludo)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        btnStart.setOnClickListener {
            val name = texName.text.toString()

            if (name.isNotEmpty()) {
                val saludo = "Hola $name, ¿Cómo estás?"
                texSaludo.text = saludo
            }
        }
        btnLimpiar.setOnClickListener {
            texName.text.clear()
            texSaludo.text = ""
        }


    }
}
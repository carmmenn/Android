package com.example.imagen

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal) // Tu layout actual

        // Captura todo el ConstraintLayout
        val layout = findViewById<View>(R.id.rootLayout) // Asegúrate de poner android:id="@+id/rootLayout" en tu ConstraintLayout
        layout.setOnClickListener {
            // Inicia MainActivity al pulsar
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra esta actividad
        }
    }
}

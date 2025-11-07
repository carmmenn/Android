package com.example.yaoilab

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vinculamos las vistas
        val btnSearch = findViewById<ImageButton>(R.id.btnSearch)
        val searchBar = findViewById<EditText>(R.id.searchBar)

        // Al pulsar el botón de la lupa, se muestra u oculta el buscador
        btnSearch.setOnClickListener {
            if (searchBar.visibility == View.GONE) {
                searchBar.visibility = View.VISIBLE
                searchBar.requestFocus()
            } else {
                searchBar.visibility = View.GONE
            }
        }
    }
}

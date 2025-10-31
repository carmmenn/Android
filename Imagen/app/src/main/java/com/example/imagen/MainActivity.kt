package com.example.imagen

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Referencias a los elementos de la interfaz
    private lateinit var iv1: ImageView
    private lateinit var btnConvertir: Button
    private lateinit var btnGris: Button
    private lateinit var btnAnimar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        iv1 = findViewById(R.id.iv1)
        btnConvertir = findViewById(R.id.btnConvertir)
        btnGris = findViewById(R.id.btnGris)
        btnAnimar = findViewById(R.id.btnAnimar)

        /*Se crean instancias de las clases implementadas*/
        val convertir = JpegConverter()
        val procesar = ProcesadorDeImagen()
        val animar = Animacion(iv1)


        //Botón para convertir a JPEG
        btnConvertir.setOnClickListener {
            // Se guarda el bitmap de la imagen
            val bitmap = (iv1.drawable as BitmapDrawable).bitmap

            // Se convierte a JPEG mediante el conversor
            val jpegBytes = convertir.convert(bitmap)

            // Se muestra un mensaje con el tamaño del archivo convertido
            Toast.makeText(this, "Convertida a JPEG (${jpegBytes.size} bytes)", Toast.LENGTH_LONG).show()
        }

        // Botón para poner gris
        btnGris.setOnClickListener {
            //Se guarda el bitmap de la imagen
            val bitmap = (iv1.drawable as BitmapDrawable).bitmap
            //Se pone en escala de grises mediante el conversor
            val gray = procesar.toGrayScale(bitmap)
            //Se muestra la imagen convertida
            iv1.setImageBitmap(gray)
        }

        // Botón para animar la imagen (rotación)
        btnAnimar.setOnClickListener {
            animar.rotate()
        }
    }
}
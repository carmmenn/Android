package com.example.imagen

import android.graphics.Bitmap
import android.graphics.Color

/*Clase que aplica filtros de procesamiento a las imágenes*/
class ProcesadorDeImagen {
    /* Método que convierte un Bitmap en escala de grises.*/
    fun toGrayScale(bitmap: Bitmap): Bitmap {
        /* Se crea una copia editable del bitmap original*/
        val newBitmap = bitmap.copy(bitmap.config!!, true)

        // Se recorren todos los píxeles de la imagen
        for (x in 0 until newBitmap.width) {
            for (y in 0 until newBitmap.height) {
                // Se obtiene el color del píxel actual
                val pixel = newBitmap.getPixel(x, y)

                // Se calcula la media de R, G y B para sacar un tono gris
                val avg = (Color.red(pixel) + Color.green(pixel) + Color.blue(pixel)) / 3

                // Se reemplaza el píxel por un gris equivalente
                newBitmap.setPixel(x, y, Color.rgb(avg, avg, avg))
            }
        }

        // Se devuelve el nuevo bitmap procesado
        return newBitmap
    }
}
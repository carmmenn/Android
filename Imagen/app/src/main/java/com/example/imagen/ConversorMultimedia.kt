package com.example.imagenes

import android.graphics.Bitmap

/*Clase abstracta base para conversores multimedia*/
abstract class ConversorMultimedia {

    /*Método abstracto que recibe un bitmap y devuelve un
    *    ByteArray (Datos en bruto ya convertidos)*/
    abstract fun convert(data: Bitmap ): ByteArray
}
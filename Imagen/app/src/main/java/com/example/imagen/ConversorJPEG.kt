package com.example.imagen
import android.graphics.Bitmap
import java.io.ByteArrayOutputStream

/* Subclase de Conversor que convierte imágenes a formato JPEG.*/
class JpegConverter : ConversorMultimedia() {

    /* Sobrescribe el método convert() de la clase padre.*/

    override fun convert(data: Bitmap): ByteArray {
        // Se crea un flujo de bytes en memoria
        val stream = ByteArrayOutputStream()

        // Se comprime el Bitmap en formato JPEG con 80% de calidad
        data.compress(Bitmap.CompressFormat.JPEG, 80, stream)

        // Se devuelve el resultado como ByteArray
        return stream.toByteArray()
    }
}
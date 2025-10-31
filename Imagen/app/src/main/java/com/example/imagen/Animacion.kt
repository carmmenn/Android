package com.example.imagen

import android.animation.ObjectAnimator
import android.view.View

/*Clase que se encarga de manejar animaciones sobre
* una vista*/
class Animacion (private val view: View) {

    /*Método para rotar la vista*/
    fun rotate(degrees: Float = 360f, duration: Long = 1000) {
        // Se crea un ObjectAnimator que modifica la propiedad "rotation" de la vista
        ObjectAnimator.ofFloat(view, "rotation", 0f, degrees).apply {
            this.duration = duration
            start()
        }
    }
}
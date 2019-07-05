package com.example.veranoaplicacion_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var pes: Int = 0
    var alt: Double = 0.0
    var imc: Double = 0.0

    fun CalcularIMC(v : View) {

        if (etPeso.text.isEmpty()) {
            Toast.makeText(this, "Falta El PESO EN KG", Toast.LENGTH_LONG).show()
            etPeso.requestFocus()
        } else if (etAltura.text.isEmpty()) {
            Toast.makeText(this, "Falta ALTURA EN MT", Toast.LENGTH_LONG).show()
            etPeso.requestFocus()
        } else {
            pes = etPeso.text.toString().toInt()
            alt = etAltura.text.toString().toDouble()
            imc = pes / (alt * alt)
            Toast.makeText(this, "Tu IMC es de :$imc", Toast.LENGTH_LONG).show()
            when {
                imc < 25 -> Toast.makeText(this, "Tu IMC es adecuado", Toast.LENGTH_LONG).show()
                imc > 25 && imc < 30 -> Toast.makeText(this, "Tu IMC es sobrepeso", Toast.LENGTH_LONG).show()
                imc > 30 && imc < 40 -> Toast.makeText(this, "Tu IMC es obesidad", Toast.LENGTH_LONG).show()
            }
        }


    }

}


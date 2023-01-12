package com.example.calculadora


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstDigit = findViewById<EditText>(R.id.tnPrimeiro)
        val secondDigit = findViewById<EditText>(R.id.tnSegundo)
        val buttonSum = findViewById<Button>(R.id.btnSoma)
        val buttonSubstraction = findViewById<Button>(R.id.btnSub)
        val buttonMultiplication = findViewById<Button>(R.id.btnMulti)
        val buttonDivision = findViewById<Button>(R.id.btnDiv)
        val resultado = findViewById<TextView>(R.id.tvOperacao)

        var numero1 : Int
        var numero2 : Int
        var result : Int

        buttonSum.setOnClickListener {
            numero1 = firstDigit.text.toString().toInt()
            numero2 = secondDigit.text.toString().toInt()

            result = numero1 + numero2
            resultado.text = result.toString()

            }

        buttonSubstraction.setOnClickListener {
                numero1 = firstDigit.text.toString().toInt()
                numero2 = secondDigit.text.toString().toInt()

                result = numero1 - numero2
                resultado.text = result.toString()
            }

        buttonMultiplication.setOnClickListener {
                numero1 = firstDigit.text.toString().toInt()
                numero2 = secondDigit.text.toString().toInt()

                result = numero1 * numero2
                resultado.text = result.toString()

            }

        buttonDivision.setOnClickListener {
                numero1 = firstDigit.text.toString().toInt()
                numero2 = secondDigit.text.toString().toInt()

                result = (numero1 / numero2)
                resultado.text = result.toString()

            }
    }

}
package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButtonToggleGroup

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstDigit = findViewById<EditText>(R.id.tnPrimeiro)
        val secondDigit = findViewById<EditText>(R.id.tnSegundo)
        val buttonSum = findViewById<Button>(R.id.btnSoma)
        val buttonMenos = findViewById<Button>(R.id.btnSub)
        val buttonMulti = findViewById<Button>(R.id.btnMulti)
        val buttonDiv = findViewById<Button>(R.id.btnDiv)
        var resultado = findViewById<EditText>(R.id.tnResultado)

        val numero1 = firstDigit.text.toString()
        val numero2 = secondDigit.text.toString()






    }
}
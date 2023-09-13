package com.example.eletriccarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var price: EditText
    private lateinit var km: EditText
    private lateinit var result: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListenner()
    }

    private fun setupView() {
        price = findViewById<EditText>(R.id.edit_kwh)
        km = findViewById<EditText>(R.id.km_percorrido)
        result = findViewById<TextView>(R.id.tv_result)
        button = findViewById<Button>(R.id.calc_btn)
    }

    private fun setupListenner() {
        button.setOnClickListener {
            calcular()
        }
    }

    private fun calcular() {
        val priceValue = price.text.toString().toFloat()
        val kmValue = km.text.toString().toFloat()

        val sum = priceValue / kmValue

        result.visibility = View.VISIBLE
        result.text = sum.toString()
    }
}
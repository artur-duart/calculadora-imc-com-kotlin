package com.example.calculadoraimc.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.calculadoraimc.R

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar!!.hide()

        val cvPesarAgora = findViewById<CardView>(R.id.cv_pesar)

        cvPesarAgora.setOnClickListener {
            val abrirMainActivity = Intent(this, MainActivity::class.java)
            startActivity(abrirMainActivity )
        }
    }
}
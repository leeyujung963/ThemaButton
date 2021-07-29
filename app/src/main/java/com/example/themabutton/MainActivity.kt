package com.example.themabutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnIn: Button
    lateinit var btnOut: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIn=findViewById(R.id.btnIn)
        btnOut=findViewById(R.id.btnOut)

        btnIn.setOnClickListener {
            val intent = Intent(this,SwuIn::class.java)
            startActivity(intent)
        }
        btnOut.setOnClickListener {
            val intent = Intent(this,SwuOut::class.java)
            startActivity(intent)
        }
    }
}
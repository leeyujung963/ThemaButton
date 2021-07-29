package com.example.themabutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SwuIn: AppCompatActivity() {
    lateinit var inTextView: TextView
    lateinit var catimageView: ImageView
    lateinit var btnFood: Button //음식점
    lateinit var btnCafe: Button //카페
    lateinit var btnRest: Button //휴식 스팟
    lateinit var btnPhoto: Button //사진 스팟
    lateinit var btnStudy: Button //스터디 스팟

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swuin)
        btnFood = findViewById(R.id.btnFood)
        btnCafe = findViewById(R.id.btnCafe)
        btnPhoto = findViewById(R.id.btnPhoto)
        btnRest = findViewById(R.id.btnRest)
        btnStudy = findViewById(R.id.btnStudy)

        btnFood.setOnClickListener {
            val intent = Intent(this, SwuIn::class.java) //리스트 화면으로 전환
            startActivity(intent)
        }
        btnCafe.setOnClickListener {
            val intent = Intent(this, SwuOut::class.java)
            startActivity(intent)
        }
        btnRest.setOnClickListener {
            val intent = Intent(this,SwuIn::class.java)
            startActivity(intent)
        }
        btnPhoto.setOnClickListener {
            val intent = Intent(this,SwuOut::class.java)
            startActivity(intent)
        }
        btnStudy.setOnClickListener {
            val intent = Intent(this,SwuIn::class.java)
            startActivity(intent)
        }
    }
}


package com.example.themabutton

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SwuOut: AppCompatActivity() {
    lateinit var outTextView: TextView
    lateinit var cat2iamgeView: ImageView
    lateinit var btnEat: Button //음식점
    lateinit var btnDrink: Button //카페
    lateinit var btnPlay: Button //놀거리
    lateinit var btnWalk: Button //산책 스팟
    lateinit var btnSstudy: Button //스터디 스팟

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swuout)

        btnEat = findViewById(R.id.btnEat)
        btnDrink = findViewById(R.id.btnDrink)
        btnPlay = findViewById(R.id.btnPlay)
        btnWalk = findViewById(R.id.btnWalk)
        btnSstudy = findViewById(R.id.btnSstudy)

        btnEat.setOnClickListener {
            val intent = Intent(this, SwuIn::class.java) //리스트 화면으로 전환
            startActivity(intent)
        }
        btnDrink.setOnClickListener {
            val intent = Intent(this, SwuOut::class.java)
            startActivity(intent)
        }
        btnPlay.setOnClickListener {
            val intent = Intent(this,SwuIn::class.java)
            startActivity(intent)
        }
        btnWalk.setOnClickListener {
            val intent = Intent(this,SwuOut::class.java)
            startActivity(intent)
        }
        btnSstudy.setOnClickListener {
            val intent = Intent(this, SwuIn::class.java)
            startActivity(intent)
        }
    }
}


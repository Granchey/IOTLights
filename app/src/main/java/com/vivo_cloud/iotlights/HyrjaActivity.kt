package com.vivo_cloud.iotlights

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HyrjaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hyrja)

        val hyrjaBtn = findViewById<Button>(R.id.button2)
        val koridoriBtn = findViewById<Button>(R.id.button3)
        var leximiBtn = findViewById<Button>(R.id.button4)
        var oraMateseBtn = findViewById<Button>(R.id.button5)

        hyrjaBtn.setOnClickListener(){
            val intent = Intent(this, HyrjaActivity::class.java)
            startActivity(intent)
        }

        koridoriBtn.setOnClickListener(){
            val intent = Intent(this, KoridoriActivity::class.java)
            startActivity(intent)
        }

        leximiBtn.setOnClickListener(){
            val intent = Intent(this, LeximiActivity::class.java)
            startActivity(intent)
        }

        oraMateseBtn.setOnClickListener(){
            val intent = Intent(this, ShpenzimetActivity::class.java)
            startActivity(intent)
        }


    }
}
package com.vivo_cloud.iotlights

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(){
//            if (email.text.equals("asd@gmail.com") && password.text.equals("asdasd")){
                val intent = Intent(this, HyrjaActivity::class.java)
                startActivity(intent)
//            }
        }
    }
}
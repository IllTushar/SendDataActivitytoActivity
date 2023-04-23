package com.example.datasendfromactivitytoactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var name:TextView
    lateinit var email :TextView
    lateinit var password:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        name = findViewById(R.id.Names)
        email = findViewById(R.id.Emails)
        password = findViewById(R.id.Passwords)

        val Name = intent.getStringExtra("name")
        val Email = intent.getStringExtra("email")
        val Password = intent.getLongExtra("password",0)
        name.text = "The Name $Name"
        email.text = "The Email $Email"
        password.text = "The Password $Password"
    }
}
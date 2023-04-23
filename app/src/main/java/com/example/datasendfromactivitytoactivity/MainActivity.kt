package com.example.datasendfromactivitytoactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var name:TextInputEditText
    lateinit var email :TextInputEditText
    lateinit var password :TextInputEditText
    lateinit var click:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.Name)
        email=findViewById(R.id.gmail)
        password = findViewById(R.id.password)
        click = findViewById(R.id.click)

        click.setOnClickListener {
         val Name = name.text.toString()
         val Email = email.text.toString()
         val Password = password.text.toString().toLong()
         val intent = Intent(this,SecondActivity::class.java)
          intent.putExtra("name",Name)
          intent.putExtra("email",Email)
          intent.putExtra("password",Password)
          startActivity(intent)
        }
    }
}
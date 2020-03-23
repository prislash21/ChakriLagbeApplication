package com.example.user.chakrilagbe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin: Button=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener()
        {
            val intent= Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}

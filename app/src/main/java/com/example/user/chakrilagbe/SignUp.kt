package com.example.user.chakrilagbe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val btnSignUp : Button=findViewById(R.id.btnSignup)
        btnSignUp.setOnClickListener(){
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }
    }
}

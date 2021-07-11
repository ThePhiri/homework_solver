package com.example.solverhomework

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private final lateinit var loginButton : Button;
    private final lateinit var forgotButton : TextView;
    private final lateinit var sigupButton : TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById<Button>(R.id.login);
        forgotButton = findViewById<TextView>(R.id.forgot);
        sigupButton = findViewById<TextView>(R.id.signup);

        loginButton.setOnClickListener {

            val i = Intent(applicationContext, HomeActivity::class.java)
            startActivity(i)
        }

        forgotButton.setOnClickListener {

            val i = Intent(applicationContext, ForgotActivity::class.java)
            startActivity(i)
        }

        sigupButton.setOnClickListener {

            val i = Intent(applicationContext, SignupActivity::class.java)
            startActivity(i)
        }

    }

}
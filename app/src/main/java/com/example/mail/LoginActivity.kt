package com.example.mail

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.mail.databinding.LoginLayoutBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var loginLayoutBinding : LoginLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        loginLayoutBinding = LoginLayoutBinding.inflate(layoutInflater)
        setContentView(loginLayoutBinding.root)
    }
}




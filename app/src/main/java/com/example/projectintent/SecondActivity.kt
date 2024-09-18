package com.example.projectintent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectintent.databinding.ActivityMainBinding
import com.example.projectintent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomor = intent.getStringExtra("nomor")
        val email = intent.getStringExtra("email")
        val name = intent.getStringExtra("name")
        val gender = intent.getStringExtra("gender")
        val password = intent.getStringExtra("password")

        with(binding){
            etEmailLogin.setText(email)
            etPassword.setText(password)

            btnLogin.setOnClickListener {
                val intentToThirdActivity =
                    Intent(this@SecondActivity, ThirdActivity::class.java)
                intentToThirdActivity.putExtra("nomor", nomor)
                intentToThirdActivity.putExtra("gender", gender)
                intentToThirdActivity.putExtra("name", name)
                intentToThirdActivity.putExtra("email", etEmailLogin.text.toString())
                startActivity(intentToThirdActivity)
            }
        }

    }
}
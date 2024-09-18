package com.example.projectintent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnRegister.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra("name", etName.text.toString())
                intentToSecondActivity.putExtra("email", etEmail.text.toString())
                intentToSecondActivity.putExtra("nomor", etPhone.text.toString())
                intentToSecondActivity.putExtra("gender", etGender.text.toString())
                intentToSecondActivity.putExtra("password", etPassword.text.toString())
                startActivity(intentToSecondActivity)
            }
        }

    }
}
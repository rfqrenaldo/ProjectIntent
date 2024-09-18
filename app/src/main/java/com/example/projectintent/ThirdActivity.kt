package com.example.projectintent

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projectintent.databinding.ActivitySecondBinding
import com.example.projectintent.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding : ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomor = intent.getStringExtra("nomor")
        val name = intent.getStringExtra("name")
        val gender = intent.getStringExtra("gender")
        val email = intent.getStringExtra("email")

        with(binding){
            tvEmail.setText(email)
            tvPhone.setText(nomor)
            tvGender.setText(gender)
            tvName.setText(name)
        }
    }
}
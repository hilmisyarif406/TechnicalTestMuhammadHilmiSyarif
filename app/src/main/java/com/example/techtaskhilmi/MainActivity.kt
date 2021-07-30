package com.example.techtaskhilmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.techtaskhilmi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnSoalSatu.setOnClickListener {
            val intent = Intent(this@MainActivity, HelloActivity::class.java)
            startActivity(intent)
        }
        binding.btnSoalDua.setOnClickListener {
            val intent = Intent(this@MainActivity, EmailCheckActivity::class.java)
            startActivity(intent)
        }
        binding.btnSoalTiga.setOnClickListener {
            val intent = Intent(this@MainActivity, TimeConvActivity::class.java)
            startActivity(intent)
        }
        binding.btnSoalEmpat.setOnClickListener {
            val intent = Intent(this@MainActivity, ReverseSentActivity::class.java)
            startActivity(intent)
        }
        binding.btnSoalLima.setOnClickListener {
            val intent = Intent(this@MainActivity, PalindromeActivity::class.java)
            startActivity(intent)
        }
    }
}
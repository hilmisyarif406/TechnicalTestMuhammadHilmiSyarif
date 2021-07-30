package com.example.techtaskhilmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.techtaskhilmi.databinding.ActivityMainBinding
import com.example.techtaskhilmi.databinding.ActivityHelloBinding

class HelloActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnPRoses.setOnClickListener {
            var angka = binding.inputsatu.text.toString()
            if ((angka.toInt() % 3 == 0) && (angka.toInt() % 5 == 0)) {
                binding.txtResult.text = "Hello World"
            } else if (angka.toInt() % 5 == 0) {
                binding.txtResult.text = "World"
            } else if (angka.toInt() % 3 == 0) {
                binding.txtResult.text = "Hello"
            } else {
                binding.txtResult.text = "angka tidak valid"
            }
        }
    }
}
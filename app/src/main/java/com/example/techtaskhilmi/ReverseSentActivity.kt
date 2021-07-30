package com.example.techtaskhilmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.techtaskhilmi.databinding.ActivityReverseSentBinding

class ReverseSentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReverseSentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReverseSentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnProses.setOnClickListener {
            var kalimatawal = binding.inptKata.text
            var kalimatakhir = kalimatawal?.reversed()
            binding.hasil.text = kalimatakhir
        }

    }
}
package com.example.techtaskhilmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.techtaskhilmi.databinding.ActivityPalindromeBinding

class PalindromeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPalindromeBinding

    fun isPalindrome(kalimat: String): Boolean {
        val sb = StringBuilder(kalimat)

        val reverseKalimat = sb.reverse().toString()

        return kalimat.equals(reverseKalimat, ignoreCase = true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPalindromeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnProses.setOnClickListener {
            val kalimatawal = binding.inptKata.text.toString()
            if (isPalindrome(kalimatawal)){
                binding.hasil.text = "True Polindrome $kalimatawal"
            }else{
                binding.hasil.text = "false"
            }
        }

    }
}
package com.example.techtaskhilmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.techtaskhilmi.databinding.ActivityEmailCheckBinding
import com.example.techtaskhilmi.databinding.ActivityHelloBinding
import java.util.regex.Pattern

class EmailCheckActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmailCheckBinding

    val validate = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                "\\@" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "?.id" +
                "|."+
                "("+
                "co"+
                "\\."+
                "id"+
                ")"+
                ")+"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        fun isValid(str:String) :Boolean {
            return validate.matcher(str).matches()
        }


        binding.btnn.setOnClickListener {
            val tulisan = binding.tulisan.text.toString()
            val konfirmValid = "${isValid(tulisan)}"
            if(konfirmValid == "true"){
                binding.hasil.text = "${isValid(tulisan)}"+" Email Valid"
            }else{
                binding.hasil.text = "${isValid(tulisan)}"+" Email tidak valid"
            }
        }
    }
}
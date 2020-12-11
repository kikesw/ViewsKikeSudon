package com.example.viewskike

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.viewskike.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // PRIMERA FORMA
        /*
        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)
        val button = findViewById<TextView>(R.id.button)*/

        // TERCERA FORMA
        binding.button.setOnClickListener{
            Toast.makeText(this@MainActivity, binding.username.text, Toast.LENGTH_LONG).show()
        }

    }
}
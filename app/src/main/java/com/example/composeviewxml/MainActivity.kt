package com.example.composeviewxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.example.composeviewxml.compose.SampleButton
import com.example.composeviewxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.miComposeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    SampleButton("Ir a Activity 2", onCLick = { openActivity() })
                }
            }
        }

    }

    private fun openActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}


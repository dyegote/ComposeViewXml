package com.example.composeviewxml

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import com.example.composeviewxml.compose.SampleButton
import com.example.composeviewxml.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addView(createViewButton())
    }

    private fun createViewButton(): Button {
        val button = Button(this)
        button.text = "BUTTON VIEW"
        return  button
    }

    private fun addView(view: View) {
        val mainLayout = binding.mainLayout
        mainLayout.addView(view)
    }
}
package com.example.composeviewxml

import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import com.example.composeviewxml.compose.ButtonComposeView
import com.example.composeviewxml.compose.SampleButton
import com.example.composeviewxml.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var composeButton: ButtonComposeView
    var text = mutableStateOf("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addView(createViewButton())
        addView(createComposeButton())
        composeButton = createComponentViewButton()
        addView(composeButton)
        text.value = "COMPOSE BUTTON"
    }

    private fun createViewButton(): Button {
        val button = Button(this)
        button.text = "BUTTON VIEW"
        button.setOnClickListener {
            //Cambio el texto del compose button
            text.value = "Nuevo Texto"
            composeButton.text.value = "Nuevo Texto compose"
        }
        return  button
    }


    private fun createComposeButton(): ComposeView {
        val composeView = ComposeView(this)
        composeView.apply {
            setContent {
                MaterialTheme {
                    SampleButton(
                        text = text.value,
                        onCLick = { }
                    )
                }
            }
        }
        return  composeView
    }

    private fun createComponentViewButton(): ButtonComposeView {
        val button = ButtonComposeView(this)
        button.text.value = "COMPOSE VIEW BUTTON"
        return button
    }

    private fun addView(view: View) {
        val mainLayout = binding.mainLayout
        mainLayout.addView(view)
    }
}
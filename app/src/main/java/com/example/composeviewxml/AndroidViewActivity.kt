package com.example.composeviewxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.example.composeviewxml.compose.PanelCompose
import com.example.composeviewxml.compose.SampleButton
import com.example.composeviewxml.databinding.ActivityAndroidViewBinding
import com.example.composeviewxml.databinding.ActivityMainBinding

class AndroidViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAndroidViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAndroidViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.miComposeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    PanelCompose()
                }
            }
        }
    }
}
package com.example.calismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calismayapisi.databinding.ActivityDetay2Binding
import com.example.calismayapisi.databinding.ActivityMainBinding

class DetayActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityDetay2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetay2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy", 0.0)
        val gelenBekar = intent.getBooleanExtra("bekar",false)

        binding.textforscreen.text = "${gelenAd}- ${gelenYas}-${gelenBoy} - ${gelenBekar}"

    }
}
package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Esconde barra superior
        supportActionBar?.hide()

        // Eventos
        binding.buttonSaveName.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save_name){

        }
    }
}
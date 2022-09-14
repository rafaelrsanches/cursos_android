package com.example.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation.infra.MotivationConstants
import com.example.motivation.R
import com.example.motivation.infra.SecurityPreferences
import com.example.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Esconde barra superior
        supportActionBar?.hide()

        handleUserName()

        // Eventos
        binding.buttonNewPhrase.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase){
            var s = ""
        }
    }

    private fun handleUserName(){
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá, $name!"
    }
}
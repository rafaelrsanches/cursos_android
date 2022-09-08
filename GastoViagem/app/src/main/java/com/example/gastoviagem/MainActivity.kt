package com.example.gastoviagem

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)

    }

    override fun onClick(view: View){
        if (view.id == R.id.button_calculate){
            calculate()
        }
    }

    private fun calculate(){

        val distance: Float = binding.editDistance.text.toString().toFloat()
        val price: Float = binding.editPrice.text.toString().toFloat()
        val autonomy: Float = binding.editAutonomy.text.toString().toFloat()

        val totalValue: Float = (distance * price) / autonomy

        binding.textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"

        //Toast.makeText(this, totalValueStr, Toast.LENGTH_SHORT).show()
    }

}
package com.example.calculadoragorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private SeekBar seekGorjeta;
    private TextView textPorcentagem;
    private TextView textGorjeta;
    private TextView textTotal;
    private double porcentagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor = findViewById(R.id.editValor);
        seekGorjeta = findViewById(R.id.seekGorjeta);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textGorjeta = findViewById(R.id.textGorjeta);
        textTotal = findViewById(R.id.textTotal);

        seekGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                porcentagem = seekGorjeta.getProgress();
                textPorcentagem.setText(seekBar.getProgress() + "%");

                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void calcular(){
        double valorDigitado = Double.parseDouble(editValor.getText().toString());

        double gorjeta = valorDigitado * (porcentagem / 100);
        double total = gorjeta + valorDigitado;

        textGorjeta.setText(String.format("R$ %.2f", gorjeta));
        textTotal.setText(String.format("R$ %.2f", total));
    }
}

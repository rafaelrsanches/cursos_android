package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etPrecoAlcool;
    private EditText etPrecoGasolina;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrecoAlcool = findViewById(R.id.etPrecoAlcool);
        etPrecoGasolina = findViewById(R.id.etPrecoGasolina);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularPreco(View view){
        String precoAlcool = etPrecoAlcool.getText().toString();
        String precoGasolina = etPrecoGasolina.getText().toString();

        Boolean camposValidados = this.validarCampos(precoAlcool, precoGasolina);

        if (camposValidados){
            this.calcularMelhorPreco(precoAlcool, precoGasolina);
        }else{
            txtResultado.setText("Preencha os preços primeiro!");
        }
    }

    public Boolean validarCampos(String pAlcool, String pGasolina){
        Boolean camposValidados = true;

        if(pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        }else if(pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina){
        double precoAlcool = Double.parseDouble(pAlcool);
        double precoGasolina = Double.parseDouble(pGasolina);

        double resultado = precoAlcool / precoGasolina;

        if (resultado >= 0.7){
            txtResultado.setText("Melhor utilizar Gasolina!");
        }else{
            txtResultado.setText("Melhor utilizar Álcool!");
        }
    }
}

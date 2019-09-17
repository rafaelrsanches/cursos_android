package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nomeProduto;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeProduto = findViewById(R.id.etNomeProduto);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void btnEnviar(View view){
        String produto = nomeProduto.getText().toString();

        tvResultado.setText(produto);
    }

}

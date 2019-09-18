package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText nomeProduto;
    private TextView tvResultado;
    private CheckBox cbBranco,
                     cbVerde,
                     cbVermelho;
    List<String> check = new ArrayList<String>();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeProduto = findViewById(R.id.etNomeProduto);
        tvResultado = findViewById(R.id.tvResultado);
        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbVermelho = findViewById(R.id.cbVermelho);
        rgEstoque = findViewById(R.id.rgEstoque);

        verificaRadioButton();
    }
    public void verificaRadioButton(){
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rbSim){
                    tvResultado.setText("Sim");
                }else{
                    tvResultado.setText("Não");
                }
            }
        });
    }

    public void verificaCheck(){
        check.clear();

        if(cbBranco.isChecked()){
            check.add(cbBranco.getText().toString());
        }
        if(cbVerde.isChecked()){
            check.add(cbVerde.getText().toString());
        }
        if(cbVermelho.isChecked()){
            check.add(cbVermelho.getText().toString());
        }

        tvResultado.setText(check.toString());
    }

    public void btnEnviar(View view){
        /*
        String produto = nomeProduto.getText().toString();
        tvResultado.setText(produto);
         */

        //verificaCheck();
    }

}

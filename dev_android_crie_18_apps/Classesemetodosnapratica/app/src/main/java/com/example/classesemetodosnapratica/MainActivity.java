package com.example.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //int numero = 10;
        Casa minhaCasa = new Casa();
        minhaCasa.cor = "Branca";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();

    }
}

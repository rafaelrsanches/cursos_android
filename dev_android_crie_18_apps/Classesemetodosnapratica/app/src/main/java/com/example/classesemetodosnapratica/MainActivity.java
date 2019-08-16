package com.example.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Rafael";
        funcionario.salario = 10000;

        double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salário do Rafael é "+ salarioRecuperado);

        //int numero = 10;

        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "Branca";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();
        */
    }
}

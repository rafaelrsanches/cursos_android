package com.example.classesemetodosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.classesemetodosnapratica.classes.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Maria", 52);


        /*
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.recuperarSaldo());
        */

        /*
        Passaro passaro = new Passaro();
        passaro.correr();

        Cao cao = new Cao();
        cao.correr();*/

        //cao.setTamanho(2);
        //System.out.println(cao.getTamanho());

        /*
        Animal animal = new Animal();
        animal.correr();
        */

        /*
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Rafael";
        funcionario.salario = 10000;

        double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salário do Rafael é "+ salarioRecuperado);
        */
        //int numero = 10;

        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "Branca";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();
        */
    }
}

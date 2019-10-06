package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConversas = findViewById(R.id.buttonConversas);
        buttonContatos = findViewById(R.id.buttonContatos);

        // Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);


        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conversasFragment = new ConversasFragment();

                // Configurar o objeto para o fragmento
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });


        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();

                // Configurar o objeto para o fragmento
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });
    }
}

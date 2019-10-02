package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        // Define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Rafael R. Sanches", "#DevMobile", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Rafael R. Sanches", "#DevMobile", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Rafael R. Sanches", "#DevMobile", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Rafael R. Sanches", "#DevMobile", R.drawable.imagem4);
        this.postagens.add(p);
    }
}

package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);

        recyclerPostagem.setLayoutManager(layoutManager);

        // Define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Rafael R. Sanches", "#DevMobile", R.mipmap.imagem1);
        this.postagens.add(p);

        p = new Postagem("Rafael R. Sanches", "#DevMobile", R.mipmap.imagem2);
        this.postagens.add(p);

        p = new Postagem("Rafael R. Sanches", "#DevMobile", R.mipmap.imagem3);
        this.postagens.add(p);

        p = new Postagem("Rafael R. Sanches", "#DevMobile", R.mipmap.imagem4);
        this.postagens.add(p);
    }
}

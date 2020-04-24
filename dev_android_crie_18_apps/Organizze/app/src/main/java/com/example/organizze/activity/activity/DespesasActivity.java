package com.example.organizze.activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.organizze.R;
import com.example.organizze.activity.helper.DateCustom;
import com.example.organizze.activity.model.Movimentacao;
import com.github.clans.fab.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class DespesasActivity extends AppCompatActivity {

    private EditText editValor;
    private TextInputEditText editData,
                              editCategoria,
                              editDescricao;
    private Movimentacao movimentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesas);

        editValor = findViewById(R.id.editValor);
        editData = findViewById(R.id.editData);
        editCategoria = findViewById(R.id.editCategoria);
        editDescricao = findViewById(R.id.editDescricao);

        // Preenche o campo data com a data atual
        editData.setText(DateCustom.dataAtual());
    }

    public void salvarDespesa (View view){

        String data = editData.getText().toString();

        movimentacao = new Movimentacao();
        movimentacao.setValor(Double.parseDouble(editValor.getText().toString()));
        movimentacao.setCategoria(editCategoria.getText().toString());
        movimentacao.setDescricao(editDescricao.getText().toString());
        movimentacao.setData(data);
        movimentacao.setTipo("d");

        movimentacao.salvar(data);

    }

}

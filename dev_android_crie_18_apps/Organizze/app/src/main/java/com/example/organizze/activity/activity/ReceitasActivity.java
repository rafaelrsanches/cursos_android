package com.example.organizze.activity.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.organizze.R;
import com.example.organizze.activity.config.ConfiguracaoFirebase;
import com.example.organizze.activity.helper.Base64Custom;
import com.example.organizze.activity.helper.DateCustom;
import com.example.organizze.activity.model.Movimentacao;
import com.example.organizze.activity.model.Usuario;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

public class ReceitasActivity extends AppCompatActivity {

    private EditText editValor;
    private TextInputEditText editData,
                              editCategoria,
                              editDescricao;
    private Movimentacao movimentacao;
    private DatabaseReference firebaseRef = ConfiguracaoFirebase.getFirebaseDatabase();
    private FirebaseAuth auth = ConfiguracaoFirebase.getFirebaseAuth();
    private Double receitaTotalAnterior;
    private Double receitaTotalAtualizada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        editValor = findViewById(R.id.editValor);
        editData = findViewById(R.id.editData);
        editCategoria = findViewById(R.id.editCategoria);
        editDescricao = findViewById(R.id.editDescricao);
        // Preenche o campo data com a data atual
        editData.setText(DateCustom.dataAtual());

        recuperarReceitaTotal();
    }

    public void salvarReceita (View view){

        if (validarCamposReceita()){

            String data = editData.getText().toString();
            Double valorPreenchido = Double.parseDouble(editValor.getText().toString());

            movimentacao = new Movimentacao();
            movimentacao.setValor(valorPreenchido);
            movimentacao.setCategoria(editCategoria.getText().toString());
            movimentacao.setDescricao(editDescricao.getText().toString());
            movimentacao.setData(data);
            movimentacao.setTipo("r");

            receitaTotalAtualizada = receitaTotalAnterior + valorPreenchido;
            atualizarReceitaTotal(receitaTotalAtualizada);

            movimentacao.salvar(data);

        }
    }

    public Boolean validarCamposReceita(){

        String campoValor = editValor.getText().toString();
        String campoData = editData.getText().toString();
        String campoCategoria = editCategoria.getText().toString();
        String campoDescricao = editDescricao.getText().toString();

        if (!campoValor.isEmpty()){
            if (!campoData.isEmpty()){
                if (!campoCategoria.isEmpty()){
                    if (!campoDescricao.isEmpty()){

                        return true;

                    }else{
                        Toast.makeText(ReceitasActivity.this,
                                "Descrição não foi preenchida!",
                                Toast.LENGTH_SHORT).show();

                        return false;
                    }
                }else{
                    Toast.makeText(ReceitasActivity.this,
                            "Categoria não foi preenchida!",
                            Toast.LENGTH_SHORT).show();

                    return false;
                }
            }else{
                Toast.makeText(ReceitasActivity.this,
                        "Data não foi preenchida!",
                        Toast.LENGTH_SHORT).show();

                return false;
            }
        }else{
            Toast.makeText(ReceitasActivity.this,
                    "Valor não foi preenchido!",
                    Toast.LENGTH_SHORT).show();

            return false;
        }

    }

    public void recuperarReceitaTotal(){

        String emailUsuario = auth.getCurrentUser().getEmail();
        String idUsuario = Base64Custom.codificarBase64(emailUsuario);
        DatabaseReference usuarioRef = firebaseRef.child("usuarios").child(idUsuario);

        usuarioRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                Usuario usuario = dataSnapshot.getValue(Usuario.class);
                receitaTotalAnterior = usuario.getReceitaTotal();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    public void atualizarReceitaTotal(Double receitaTotalAtualizada){

        String emailUsuario = auth.getCurrentUser().getEmail();
        String idUsuario = Base64Custom.codificarBase64(emailUsuario);
        DatabaseReference usuarioRef = firebaseRef.child("usuarios").child(idUsuario);

        usuarioRef.child("receitaTotal").setValue(receitaTotalAtualizada);

    }

}

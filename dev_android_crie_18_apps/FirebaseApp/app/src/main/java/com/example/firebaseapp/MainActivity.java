package com.example.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         DatabaseReference usuarios = referencia.child("usuarios");
         DatabaseReference produtos = referencia.child("produtos");


         usuarios.addValueEventListener(new ValueEventListener() {
             @Override
             public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                 Log.i("FIREBASE", dataSnapshot.getValue().toString());
             }

             @Override
             public void onCancelled(@NonNull DatabaseError databaseError) {

             }
         });

         /*
         Usuario usuario = new Usuario();
         usuario.setNome("Maria");
         usuario.setSobrenome("Silva");
         usuario.setIdade(58);

         usuarios.child("002").setValue(usuario);


         Produto produto = new Produto();
         produto.setDescricao("330s");
         produto.setMarca("Lenovo");
         produto.setPreco(3299.90);

         produtos.child("002").setValue(produto);
        */
    }
}

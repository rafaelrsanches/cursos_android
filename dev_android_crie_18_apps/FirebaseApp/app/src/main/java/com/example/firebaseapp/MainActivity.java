package com.example.firebaseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    //private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    //private FirebaseAuth auth = FirebaseAuth.getInstance();
    private ImageView imageFoto;
    private Button buttonUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageFoto = findViewById(R.id.imageFoto);
        buttonUpload = findViewById(R.id.buttonUpload);

        buttonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Configura para imagem ser salva em memória
                imageFoto.setDrawingCacheEnabled(true);
                imageFoto.buildDrawingCache();

                // Recupera bitmap da imagem (imagem a ser carregada)
                Bitmap bitmap = imageFoto.getDrawingCache();

                // Comprime bitmap para um formato png/jpeg
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 75, baos);

                // Converte o baos para pixels brutos em uma matriz de bytes (dados da imagem)
                byte[] dadosImagem = baos.toByteArray();

                // Define nós para o storage
                StorageReference storageReference = FirebaseStorage.getInstance().getReference();
                StorageReference imagens = storageReference.child("imagens");

                // Nome da imagem
                String nomeArquivo = UUID.randomUUID().toString();
                StorageReference imagemRef = imagens.child(nomeArquivo + ".jpeg");

                // Retorna o objeto que irá controlar o upload
                UploadTask uploadTask = imagemRef.putBytes(dadosImagem);

                uploadTask.addOnFailureListener(MainActivity.this, new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this,
                                        "Upload da imagem falhou: " + e.getMessage(),
                                        Toast.LENGTH_LONG).show();
                    }
                }).addOnSuccessListener(MainActivity.this, new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        Uri url = taskSnapshot.getDownloadUrl();

                        Toast.makeText(MainActivity.this,
                                "Sucesso ao fazer upload: " + url.toString(),
                                Toast.LENGTH_LONG).show();
                    }
                });

            }
        });


        //DatabaseReference usuarios = referencia.child("usuarios");

        //DatabaseReference usuarioPesquisa = usuarios.child("-LzY47rumaIXJ2CQXQND");

        //Query usuarioPesquisa = usuarios.orderByChild("nome").equalTo("Rafael");
        //Query usuarioPesquisa = usuarios.orderByKey().limitToFirst(3);
        //Query usuarioPesquisa = usuarios.orderByKey().limitToLast(2);

        // Maior ou igual (>=)
        //Query usuarioPesquisa = usuarios.orderByChild("idade").startAt(35);

        // Menor ou igual (<=)
        //Query usuarioPesquisa = usuarios.orderByChild("idade").endAt(22);

        // Entre dois valores
        //Query usuarioPesquisa = usuarios.orderByChild("idade")
        //                                .startAt(18)
        //                                .endAt(22);

        // Filtrar palavras
        /*Query usuarioPesquisa = usuarios.orderByChild("nome")
                                        .startAt("R")
                                        .endAt("R" + "\uf8ff");

        usuarioPesquisa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //Usuario dadosUsuario = dataSnapshot.getValue(Usuario.class);
                //Log.i("Dados usuario: ", "nome: " + dadosUsuario.getNome() + " idade: " + dadosUsuario.getIdade());
                Log.i("Dados usuario: ", dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        */

        /*
        Usuario usuario = new Usuario();
        usuario.setNome("Rodrigo");
        usuario.setSobrenome("Matos");
        usuario.setIdade(35);

        usuarios.push().setValue(usuario);
        */

        // Logar usuário
        /*
        auth.signInWithEmailAndPassword(
                "rafaelrsanches@devkotlin.com", "devkotlin123")
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("signIn", "Sucesso ao logar usuário");
                        }else{
                            Log.i("signIn", "Erro ao logar usuário");
                        }
                    }
                });

         */


        // Deslogar usuário
        //auth.signOut();


        // Verifica usuário logado
        /*
        if (auth.getCurrentUser() != null){
            Log.i("CurrentUser", "Usuário logado");
        } else {
            Log.i("CurrentUser", "Usuário não logado");
        }
        */

        // Cadastro do usuário
        /*
        auth.createUserWithEmailAndPassword(
                "rafaelrsanches@devkotlin.com", "devkotlin123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("CreateUser", "Sucesso ao cadastrar usuário");
                        }else{
                            Log.i("CreateUser", "Erro ao cadastrar usuário");
                        }
                    }
                });

        */
        /*
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

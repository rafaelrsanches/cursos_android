package com.example.organizze.activity.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFirebase {
    private static DatabaseReference firebaseDatabase;
    private static FirebaseAuth autenticacao;

    // Retorna a instancia do FirebaseDatabase
    public static DatabaseReference getFirebaseDatabase() {
        if (firebaseDatabase == null) {
            firebaseDatabase = FirebaseDatabase.getInstance().getReference();
        }
        return firebaseDatabase;
    }

    // Retorna a instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAuth(){
        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }

        return autenticacao;
    }

}

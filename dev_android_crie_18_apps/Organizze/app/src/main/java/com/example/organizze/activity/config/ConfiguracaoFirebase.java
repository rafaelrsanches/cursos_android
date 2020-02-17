package com.example.organizze.activity.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguracaoFirebase {
    private static FirebaseAuth autenticacao;

    // Retorna a instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAuth(){
        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }

        return autenticacao;
    }

}

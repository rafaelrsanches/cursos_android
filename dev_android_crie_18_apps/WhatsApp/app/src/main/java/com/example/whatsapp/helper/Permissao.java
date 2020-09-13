package com.example.whatsapp.helper;

import android.app.Activity;
import android.os.Build;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class Permissao {

    public static boolean validarPermissoes(String[] permissoes, Activity activity){

        if (Build.VERSION.SDK_INT >= 23){

            List<String> listaPermissoes = new ArrayList<>();

            // Percorrer as permissões passadas, verificando
            //  uma a uma se já tem a permissão liberada.
            for (String permissao: permissoes){

                ContextCompat.checkSelfPermission(activity, permissao);

        }

        return true;
    }

}

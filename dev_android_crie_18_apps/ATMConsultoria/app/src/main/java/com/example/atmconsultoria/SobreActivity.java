package com.example.atmconsultoria;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String textoSobre = "A ATM Consultoria tem como missão apoiar as organizações que desejam alcançar o sucesso através da" +
                            " excelência em gestão e da busca pela Qualidade\n\n" +
                            "Nosso trabalho é dar suporte às empresas que desejam se certificar em padrões de qualidade ou investir no" +
                            " desenvolvimento e evolução de sua gestão, por meio da otimização dos processos e da disseminação dos" +
                            " Fundamentos e Critérios de Excelência";

        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription(textoSobre)
                .addGroup("Fale Conosco")
                .addEmail("atmconsultoria@android.com", "Envie um e-mail")
                .addWebsite("http://google.com.br/", "Acesse nosso site")
                .addGroup("Redes Sociais")
                .addFacebook("Google", "Facebook")
                .addInstagram("google", "Instagram")
                .addYoutube("google", "Youtube")
                .addGitHub("rafaelrsanches", "GitHub")
                .create();

        setContentView(sobre);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

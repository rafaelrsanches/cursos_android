package com.example.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            // Criar banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            // Criar tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3))");
            //bancoDados.execSQL("DROP TABLE pessoas");

            // Inserir dados
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES ('Maria', 35)");
            //bancoDados.execSQL("INSERT INTO pessoas(nome, idade) VALUES ('Mario', 55)");


            // Atualizando e removendo registros
            //bancoDados.execSQL("UPDATE pessoas SET idade = 19, nome = 'Mariana Silva' WHERE nome = 'Mariana'");


            // Recuperar pessoas
            /*String consulta =
                    "SELECT nome, idade " +
                    "FROM pessoas " +
                    "WHERE nome = 'Rafael'";*/

            /*String consulta =
                    "SELECT nome, idade " +
                    "FROM pessoas " +
                    "WHERE idade >= 30 OR idade = 18";*/

            /*String consulta =
                    "SELECT nome, idade " +
                    "FROM pessoas " +
                    "WHERE nome IN('Rafael', 'KotlinDev')";*/

            /*String consulta =
                    "SELECT nome, idade " +
                    "FROM pessoas " +
                    "WHERE idade BETWEEN 18 AND 23";*/
            /*String filtro = "mar";
            String consulta =
                    "SELECT nome, idade " +
                    "FROM pessoas " +
                    "WHERE nome LIKE '%" + filtro + "%'";*/

            String consulta =
                    "SELECT id, nome, idade " +
                            "FROM pessoas " +
                            "WHERE 1=1 ORDER BY idade";
            Cursor cursor = bancoDados.rawQuery(consulta, null);

            // Indices da tabela
            int indiceId = cursor.getColumnIndex("id");
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while (cursor != null){
                String id = cursor.getString(indiceId);
                String nome = cursor.getString(indiceNome);
                String idade = cursor.getString(indiceIdade);

                Log.i("Resultado - Id ", id + " - Nome: " + nome + " - Idade: " + idade);
                cursor.moveToNext();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

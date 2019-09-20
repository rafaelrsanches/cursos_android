package com.example.componentesdeinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Switch switchEstado;
    private ToggleButton toggleEstado;
    private CheckBox checkEstado;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchEstado = findViewById(R.id.switchEstado);
        toggleEstado = findViewById(R.id.toggleEstado);
        checkEstado = findViewById(R.id.checkEstado);
        textResultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view){
        textResultado.setText("");

        if(switchEstado.isChecked()){
            textResultado.append("Switch ligado\n");
        }else if(!switchEstado.isChecked()){
            textResultado.append("Switch desligado\n");
        }

        if(toggleEstado.isChecked()){
            textResultado.append("Toggle ligado\n");
        }else if(!toggleEstado.isChecked()){
            textResultado.append("Toggle desligado\n");
        }

        if(checkEstado.isChecked()){
            textResultado.append("CheckBox ligado\n");
        }else if(!checkEstado.isChecked()){
            textResultado.append("CheckBox desligado\n");
        }
    }
}

package com.example.organizze.activity.helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){
        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = simpleDateFormat.format(data);
        return dataString;
    }

    public static String mesAnoDataEscolhida (String data){

        String returnoData[] = data.split("/");
        String dia = returnoData[0];
        String mes = returnoData[1];
        String ano = returnoData[2];

        String mesAno = mes + ano;
        return mesAno;

    }

}

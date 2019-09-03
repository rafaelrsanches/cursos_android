package com.example.classesemetodosnapratica;

public class Rafael extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleicao no Brasil");
    }
}

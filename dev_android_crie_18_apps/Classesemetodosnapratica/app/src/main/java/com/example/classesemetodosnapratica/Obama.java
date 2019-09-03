package com.example.classesemetodosnapratica;

public class Obama extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleicao nos Estados Unidos");
    }
}

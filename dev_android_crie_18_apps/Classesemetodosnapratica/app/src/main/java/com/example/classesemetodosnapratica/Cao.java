package com.example.classesemetodosnapratica;

class Cao extends Animal {
    void latir(){
        System.out.println("Latir como um cão");
    }

    void correr(){
        super.correr();
        System.out.println("cão");
    }
}

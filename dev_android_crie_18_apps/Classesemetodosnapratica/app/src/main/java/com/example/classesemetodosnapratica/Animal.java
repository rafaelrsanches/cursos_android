package com.example.classesemetodosnapratica;

class Animal {
    int tamanho;
    String cor;
    double peso;

    //Getter e Setter

    int getTamanho(){
        return tamanho;
    }

    void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    double getPeso() {
        return peso;
    }

    void setPeso(double peso) {
        this.peso = peso;
    }


    void dormir() {
        System.out.println("Dormir como um animal");
    }
    void correr(){
        System.out.print("Correr como um ");
    }
}

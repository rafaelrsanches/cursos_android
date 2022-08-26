fun main(){
    // class - comportamentos e atributos

    // classe (instancia) objetos || "... = Classe()" == instancia, gera o objeto
    var pessoa: Pessoa = Pessoa(2014, "Monero", "2014X2014X")

    pessoa.nome
    pessoa.acordar()

}

class Pessoa(val anoNascimento: Int, var nome: String){

    var documento: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome){
        this.documento= doc
    }

    fun dormir(){

    }
    fun acordar(){

    }
}
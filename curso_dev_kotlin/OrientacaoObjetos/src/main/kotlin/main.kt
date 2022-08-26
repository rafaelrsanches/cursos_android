fun main(){
    // class - comportamentos e atributos

    // classe (instancia) objetos || "... = Classe()" == instancia, gera o objeto
    var pessoa: Pessoa = Pessoa(2014, "Monero")

    pessoa.nome
    pessoa.acordar()
    pessoa.olhos

}

class Pessoa(val anoNascimento: Int, var nome: String){

    var olhos: String = ""

    fun dormir(){

    }
    fun acordar(){

    }
}
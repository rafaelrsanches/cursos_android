fun main() { // Não da para criar objetos de uma classe abstract.

}

abstract class Mamifero (val nome: String){ // Para ter uma função/método abstract é necessário ter abstract na classe.
    fun acordar() {}

    fun dormir() {}

    abstract fun falar() // Uma função/método abstract sempre terá override e implementação nas classes herdeiras.
}

class Cachorro(nome: String) : Mamifero(nome) { // Uma classe que herda uma classe abstract obrigatóriamente precisa implementar as funções/métodos abstracts.
    override fun falar() {
        println("au au")
    }
}
fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.teste()
    Matematica.teste()

    Matematica.obj1.teste1() // object precisa especificar o caminho inteiro.

    val m = Matematica()
}

class Matematica{
    companion object NOME { // companion object faz o mesmo comportamento do static do Java, e só existe 1 na classe.
        val PI = 3.1415
        fun teste() {}

        init {
            println("Fui inicializado!")
        }

    }

    object obj1{ // object pode ter mais de 1 na classe, e é obrigatório ter nome
        fun teste1() {}
    }

    object obj2{

    }
}
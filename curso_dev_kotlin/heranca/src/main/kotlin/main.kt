fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    c.marca
}

open class Eletronico(var marca: String){

    private val s: String = ""

    private fun ativarCorrenteEletrica() {}
    fun ligar() {
        ativarCorrenteEletrica()
    }
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca){
    fun instalarSoftware() {}
    fun processarDados() {}
}

private class X // private class só permite acesso no mesmo arquivo e também impede que seja herdada.

// private fun dentro de uma classe, só a própria classe enxerga.
// protected fun dentro de uma classe, a própria classe e as classes herdeiras enxergam.
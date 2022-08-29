fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    c.marca
}

open class Eletronico(var marca: String){
    fun ligar(){}
    fun desligar(){}
}

class Computador(marca: String) : Eletronico(marca){
    fun instalarSoftware() {}
    fun processarDados() {}
}
fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
}

open class Eletronico(var marca: String){
    private fun ativarCorrenteEletrica(ativo: Boolean) {}
    fun ligar() {
        ativarCorrenteEletrica(true)
    }
    open fun desligar() {
        ativarCorrenteEletrica(false)
    }
}

class Computador(marca: String) : Eletronico(marca){

    fun save() {}
    fun save(a: Int) {}

    override fun desligar() {
        save()
        super.desligar()
    }


}

private class X // private class só permite acesso no mesmo arquivo e também impede que seja herdada.

// private fun dentro de uma classe, só a própria classe enxerga.
// protected fun dentro de uma classe, a própria classe e as classes herdeiras enxergam.
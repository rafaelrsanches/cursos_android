fun main(){
    val p = Programa()
    p.salvar(object : Event{ // Classe anônima, é a instância de uma classe que implementa a interface.
        override fun onSuccess() {
            println("onSuccess!")
        }

    })
}

interface Event{
    fun onSuccess()
}

class Programa{
    fun salvar(e: Event){
        println("Abrindo conexões.")
        println("Salvando conexões.")
        println("Sucesso. Conexões fechadas.")
        e.onSuccess()
    }
}
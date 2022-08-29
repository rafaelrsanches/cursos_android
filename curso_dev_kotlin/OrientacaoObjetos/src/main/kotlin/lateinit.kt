fun main() {
    var r: Receita = Receita()
    r.imprimirReceita()

    println(r.instrucoes)
}

class Receita(){
    lateinit var instrucoes: String

    fun geraReceita(){
        instrucoes = "Lave as mãos."
    }

    fun imprimirReceita(){
        if (!this::instrucoes.isInitialized){
            instrucoes = "Lave as mãos."
        }
    }

}
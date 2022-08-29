fun main(){
    val objetoComNomeGrandePessoa = Pessoa(2014, "Monero")
    objetoComNomeGrandePessoa.acordar()
    objetoComNomeGrandePessoa.dormir()

    with(objetoComNomeGrandePessoa){
        acordar()
        dormir()
        documento
    }
}
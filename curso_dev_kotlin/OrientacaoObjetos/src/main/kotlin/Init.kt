fun main(){
    var a = Animal("Cachorro")
    a.fala = "auuu"
}

class Animal(var especie: String){

    // O Field vai valer pra qual variável ele estiver declarado logo abaixo.

    var fala: String = ""

        get() {
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
        }

    var idade: Int = 0

        get() {
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
        }

}
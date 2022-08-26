fun main(){
    Animal("Cachorro").falar()
}

class Animal(var especie: String){

    var fala: String = ""

    init {
        if (especie.lowercase() == "cachorro"){
            fala = "au"
        } else if (especie.lowercase() == "gato"){
            fala = "miau"
        } else {
            fala = ""
        }
    }

    fun falar(){
        println(fala)
    }

}
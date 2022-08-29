fun main(){
    val f1: FormaData = FormaData(10, 8)
    var f2: FormaData = FormaData(10, 8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("--------------")
    println(f2.toString())
    println(f2.hashCode())

    f2 = f1 // Aponta o objeto f2 para o mesmo endereço de memória de f1.
    f2 = f1.copy() // Copia os valores de f1 para f2

}

class Forma(val a: Int, val b: Int){
    override fun equals(other: Any?): Boolean {  // Depois do override, compara os valores do objeto
        return if (other is Forma){
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }

    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }

}

data class FormaData(val a: Int, val b: Int){}
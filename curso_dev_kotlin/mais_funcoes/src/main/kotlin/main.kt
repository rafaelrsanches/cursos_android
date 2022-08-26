fun main() {
    println(media("Tari",10f, 8f, 10, "Monero", true))
}

fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas){
        if (n is Float){
            soma += n
        }
    }
    return (soma / notas.size)
}
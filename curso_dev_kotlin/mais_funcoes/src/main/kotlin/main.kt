fun main() {
    println(media(1f, 2f, 3f, 6.5f, 8f))
}

fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}
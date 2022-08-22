import kotlin.math.*

fun main() {
    converteAnos(2)
    qntdChar("Quantidade de caracter")
    println(calculaCuboInt(3))
    println(milhasEmKm(5f))
    trocaChar("Troca A por X")
}

fun converteAnos(anos: Int) {
    println("$anos anos equivalem a: ")
    println("${(anos * 12)} meses")
    println("${(anos * 365)} dias")
    println("${(anos * 365 * 24)} horas")
    println("${(anos * 365 * 24 * 60)} minutos")
    println("${(anos * 365 * 24 * 60 * 60)} segundos")
}

fun qntdChar(str: String) = println(str.length)

fun calculaCuboInt(n: Int): Int = (n * n * n)

fun milhasEmKm (n: Float): Float = (n * 1.6f)

fun trocaChar(str: String) = println(str.replace("a", "x", true).lowercase())

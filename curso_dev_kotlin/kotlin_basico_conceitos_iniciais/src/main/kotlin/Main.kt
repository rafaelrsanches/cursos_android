import kotlin.math.*

fun main() {
    println(ex1(5,6))
    println(ex2(5,5,5))
}

fun ex1 (lado1: Int, lado2: Int): String {
    if (lado1 == lado2) return "Forma um quadrado"
    else return "Não forma um quadrado"
}

fun ex2 (lado1: Int, lado2: Int, lado3: Int): String{
    if ((lado1 == lado2) && (lado1 == lado3)) return "Triângulo equilátero"
    else return "Não é um triângulo equilátero"

}
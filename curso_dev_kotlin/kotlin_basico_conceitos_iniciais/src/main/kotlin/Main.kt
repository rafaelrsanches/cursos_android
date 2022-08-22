fun main() {
    helloWorld()
    println("A soma de 10 e 5 é: ${sum(10, 5)}")

    println(divisao(10f, 3.5f))
}

fun sum(a: Int, b: Int): Int = (a + b)

fun helloWorld() = println("Hello, world!")

fun divisao(a: Float, b: Float): Float = (a / b)
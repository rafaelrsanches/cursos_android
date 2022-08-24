import kotlin.math.*

fun main() {
    try {
        println("Exemplo: tenta abrir banco")

        val s: String? = null
        println(s!!.length)

        val a: Int = 10 / 0

    } catch (e: NullPointerException) {
        println("Variável nula!")
    } catch (e: ArithmeticException){
        println("Impossível dividir por zero!")
    } catch (e: Exception){
        println("Exceção genérica!")
    } finally {
        println("Exemplo: fecha banco")
    }
}

import kotlin.math.*

fun main() {
    val str: String? = null

    // Expressão abaixo é a mesma coisa que if (str != null)
    str?.let {
        it.lowercase()
        it.length
    }
}

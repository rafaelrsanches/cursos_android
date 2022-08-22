fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da string: ${str.length}")

    println("Posição 0 da string: ${str[0]}")
    println("Posição 1 da string: ${str[1]}")
    println("Posição 2 da string: ${str[2]}")
    println("Posição 3 da string: ${str[3]}")

    println(str.startsWith("Pro", true))
    println(str.endsWith("lin", true))

    println(str.substring(2, 5))

    println(str.replace("Programação", "Dev", true))

    println(str.lowercase())

    println(str.uppercase())

    println(str.trim()) // Elimina espaços em branco nas extremidades da String
}

fun main() {
    val data = geraDados()

    println(data.any())
    println(listOf<Int>().any())

    println(data.count())

    println("Primeira receita: ${data.first().nome}")
    println("Última receita: ${data.last().nome}")

    println(data.sumOf { it.calorias })

    println(data.filter { it.calorias > 600 })
}

fun geraDados(): List<Receita>{
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())

data class Ingrediente(val nome: String, val quantidade: Int)
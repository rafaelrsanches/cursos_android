fun main() {

    // Map, é uma coleção Pair("chave", "valor"), sendo a chave única.

    val map1: Map<String, String> = mapOf(Pair("França", "Paris"), Pair("Alemanha", "Berlim"), Pair("Alemanha", "xpto"))
    val map2: MutableMap<String, String> = mutableMapOf(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)
    println(map1.entries)
    println(map1.values)

    map2["Brasil"] = "Brasília"
    println(map2)

    map2.remove("França")
    map2.contains("Brasil")
    map2.clear()
}
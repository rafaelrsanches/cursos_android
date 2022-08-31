fun main() {

    // Set, não é necessariamente uma sequência ordenada, e não permite valores duplicados.

    val set1: Set<String> = setOf("Paris", "Berlim", "Madrid", "Madrid") // Não da pra modificar
    val set2: MutableSet<String> = mutableSetOf() // Da pra modificar, mesmo usando val.

    println(set1) // Não imprime 2 vezes Madrid, pois não armazena valores duplicados.

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")
    set2.size
    set2.clear()

    // set2[] = Set não tem index

}
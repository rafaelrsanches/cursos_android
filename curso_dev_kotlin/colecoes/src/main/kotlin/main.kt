fun main() {

    // List

    val lst1: List<Int> = listOf(1, 2, 3, 4, 5) // Não da pra modificar
    val lst2: MutableList<Int> = mutableListOf(6, 7, 8, 9, 10) // Da pra modificar, mesmo usando val.

    println(lst2[0])
    println(lst2.size)

    lst2.add(12)
    lst2.add(10)
    println(lst2)
    lst2.remove(10)
    lst2.removeAt(0)

    println(lst2)
}
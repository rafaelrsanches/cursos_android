fun main(){
    abc()
}
fun countXO(str: String): Boolean {
    val strLower: String = str.lowercase()
    var somaX: Int = 0
    var somaO: Int = 0
    var i: Int = 0
    while (i < strLower.length){
        if (strLower[i] == 'x'){
            somaX++
        }
        else if (strLower[i] == 'o'){
            somaO++
        }
        i++
    }
    return ((somaX == somaO) && (somaX != 0))
}

fun abc(): Boolean {
    throw NullPointerException()
}
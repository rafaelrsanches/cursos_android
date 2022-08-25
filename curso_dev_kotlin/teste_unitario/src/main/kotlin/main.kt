fun main(){
    println(countXO("xxoo"))
    println(countXO("xxooo"))
    println(countXO("aa"))
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
import kotlin.math.*

fun main() {
   ex2()
}

fun ex1(){
    var baloes: Int = 0

    while (baloes * 7 + 7 < 2000){
        baloes++
    }
    println("É necessário $baloes baloẽs para encher a caixa d'água de 2.000 litros.")
}

fun ex2(){
    var i: Int = 1
    while (i <= 50){
        if ((i % 3 == 0) && (i % 5 == 0)){
            println("$i - FizzBuzz")
        }
        else if (i % 3 == 0){
            println("$i - Buzz")
        }
        else if (i % 5 == 0){
            println("$i - Fizz")
        } else{
            println("$i")
        }
        i++
    }
}

fun ex3(str: String){
    var contador: Int = str.length - 1
    while (contador >= 0){
        print(str[contador])
        contador--
    }
}

fun ex4(str: String): Boolean {
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
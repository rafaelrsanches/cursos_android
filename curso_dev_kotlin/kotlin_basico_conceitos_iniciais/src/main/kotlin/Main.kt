import kotlin.math.*

fun main() {

    val str: String = "Dev Android Kotlin"

    var i: Int = 0
    while (i < 100){
        if (i < 50){
            i++
            continue
        }

        print("$i ")
        i++

    }
}
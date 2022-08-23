import kotlin.math.*

fun main() {
    val bonus = bonusWhen("Gerente")
    println(bonus)
}
 fun calculaBonus(cargo: String, tempoDeExp: Int): Float{
    if (cargo == "Gerente"){
        if (tempoDeExp >= 2){
            return 3000f
        } else {
            return 2000f
        }
    }
    else if (cargo == "Coordenador"){
        if (tempoDeExp >= 1){
            return 1800f
        } else {
            return 1500f
        }
     }
    else if (cargo == "Engenheiro de software"){
         return 1000f
     }
    else if (cargo == "Estagiário"){
         return 500f
     }

     return 0f
 }

fun bonusWhen(cargo: String): Float{
    return when (cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}
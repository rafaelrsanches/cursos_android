import kotlin.math.*

fun main() {
    val bonus = calculaBonus("Gerente", 2)
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
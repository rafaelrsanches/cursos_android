import kotlin.math.*

fun main() {
    val salario: Float = 10000f
    var patAna: Float = 0f
    var patPaula: Float = 0f
    var qntdMeses: Int = 0

    do {
        patAna += (salario * 0.05f) + (salario * 0.05f) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        qntdMeses++
    }while (patAna > patPaula)

    println("Paula vai passar o patrimônio de Ana no mês $qntdMeses")
}

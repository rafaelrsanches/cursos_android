package business

import entity.Convite
import java.util.IdentityHashMap

class ConvidadoBusiness {
    fun tipoValido(tipo: String): Boolean = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(convite: Convite): Boolean {
        return when (convite.tipo) {
            "comum" -> convite.codigo.startsWith("xt")
            "premium", "luxo" -> convite.codigo.startsWith("xl")
            else -> false
        }
    }

    fun maiorDeIdade(idade: Int): Boolean = (idade >= 18)

}
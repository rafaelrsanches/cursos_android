package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println(controle())
    }

    private fun controle(): String{
        val idade: Int = Console.readInt("Qual sua idade? ")
        val convidado = Convidado(idade = idade)

        if (!convidadoBusiness.maiorDeIdade(convidado.idade)){
            return "Negado. Menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)){
            return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Qual é o codigo do convite? ")
        if (!convidadoBusiness.codigoValido(convidado)){
            return "Negado. Código inválido."
        }
        return "Welcome! :)"
    }
}
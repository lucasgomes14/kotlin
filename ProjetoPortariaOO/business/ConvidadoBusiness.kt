package ProjetoPortariaOO.business

import ProjetoPortariaOO.entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String): Boolean = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(convite: Convidado) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "luxo", "premium" -> convite.codigo.startsWith("xl")
        else -> false
    }

    fun maiorDeIdade(idade: Int) = (idade >= 18)
}
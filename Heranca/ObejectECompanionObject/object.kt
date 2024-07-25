package Heranca.ObejectECompanionObject

/**
 * companion object - Sempre somente 1 por classe. Pode ou não ser nomeado.
 * object - Quantos desejar por classe. Deve ter nome.
 * --
 * É comparável ao static do Java. Porém, caso seja preciso chamar a partir do Java,
 * deve ser feito a annotation @JvmStatic.
 * --
 * Ambos companion object e object são inicializados a primeira vez que são acessados.
 * Nas demais vezes, o valor já está disponível na execução do programa.
 */

fun main() {
    // init disparado
    Empresa.Inscricao.numero

    // init não é mais chamado
    Empresa.Inscricao.numero
    Empresa.Inscricao.numero

    Empresa.setor
    Empresa.setor
}

class Empresa {
    object Inscricao {
        val numero = "saasfagfa"
        fun abc() {}

        init {
            print("Init disparado!")
        }
    }

    companion object NOME {
        val setor = "Agropecuaria"

        init {
            print("Init disparado!")
        }
    }
}
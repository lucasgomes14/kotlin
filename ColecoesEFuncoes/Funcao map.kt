package ColecoesEFuncoes

// faz uma nova lista a partir predicado

fun main() {
    val data = geraDados()

    println(data.map { it.nome })
}
package ColecoesEFuncoes

// percorre lista a partir do predicado

fun main() {
    val data = geraDados()

    data.forEach { println(it.nome) }
    println()
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }
}
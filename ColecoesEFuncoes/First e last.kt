package ColecoesEFuncoes

// first o primeiro item e se nao tiver item da erro
// last o ultimo item e se nao tiver item da erro
// firstOrNull o primeiro item ou nulo
// firstOrNull o ultimo item ou nulo

fun main() {
    val data = geraDados()

    println("Primeira receita: ${data.first().nome}")
    println("Ultima receita: ${data.last().nome}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())
}
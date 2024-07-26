package ColecoesEFuncoes

// sum soma uma lista de numeros
// sumOf soma de algo especifico que aceita predicado

fun main() {
    val data = geraDados()

    println(listOf(1, 2, 3).sum())
    println(data.sumOf { it.calorias })
}
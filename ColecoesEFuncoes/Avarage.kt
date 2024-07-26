package ColecoesEFuncoes

// media

fun main() {
    val data = geraDados()

    println(listOf(1, 2, 3).average())
    println(data.map { it.calorias }.average())
}
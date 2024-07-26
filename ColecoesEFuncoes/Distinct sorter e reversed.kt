package ColecoesEFuncoes

// distinct retorna valores unicos
// sorted ordena
// sortedDesceding
// reversed deixa ao contrario

fun main() {
    val data = geraDados()
    val list = listOf(1, 3, 4, 4, 53, 4, 7, 6, 8, 8, 8)
    println(list.distinct())
    println(data.distinctBy { it.nome })
    println(list.sorted())
    println(list.sortedDescending())
    println(list.reversed())
}
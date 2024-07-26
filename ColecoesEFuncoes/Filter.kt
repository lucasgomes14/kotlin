package ColecoesEFuncoes

// filtra algo a partir do predicadp

fun main() {
    val data = geraDados()

    println(data.filter { it.nome == "Lasanha" })
    println(data.filter { it.calorias > 500 })

    // predicado
    println(data.filter { it.calorias > 500 }.any())
    println(data.any { it.calorias > 500 })
    println(data.count { it.calorias > 500 })
}
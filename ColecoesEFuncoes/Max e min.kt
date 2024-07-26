package ColecoesEFuncoes

// maximo e minimo so funciona na lista de numeros

fun main() {
    val data = geraDados()

    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })

    listOf(1, 2, 3).maxOf { it }
    listOf(1, 2, 3).maxOrNull()

    listOf(1, 2, 3).minOf { it }
    listOf(1, 2, 3).minOrNull()

    println(data.maxByOrNull { it.calorias })
    println(data.minByOrNull { it.calorias })
}
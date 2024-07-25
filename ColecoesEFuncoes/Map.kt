package ColecoesEFuncoes

/**
 * Map
 *
 * Mapa são listas de dados entrada-valor. Significa que para uma chave, existe um valor associado.
 * Assim como Set, map também não permite elementos duplicados.
 */

fun main() {
    val map1: Map<String, String> = mapOf(Pair("França", "Paris"), Pair("França", "Paris"))
    val map2 = mutableMapOf(Pair("França", "Paris"), Pair("França", "Paris"))

    // Todas as entradas, ou seja, chaves
    println(map1.entries)

    // Todos os valores
    println(map1.values)

    // Como adicionar novos valores
    map2["Alemanha"] = "Berlim"
    println(map2)

    // Como remover valores
    map2.remove("Alemanha")
    println(map2)

    // Verifica se existe o elemento
    println(map2.contains("França"))

    // imprime o valor associado a chave
    println(map2["França"])

    // Limpando coleção
    map2.clear()
}
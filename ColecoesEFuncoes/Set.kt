package ColecoesEFuncoes

/**
 * Set
 *
 * A coleção Set não permite elementos duplicados, o que é uma característica muito útil.
 * Caso dois valores iguais sejam adicionados no Set, somente um deles será usado e não acontecerá erro.
 * Não tem index
 * */

fun main() {
    // Criação de Set com String e Int. Aceita qualquer tipo de dado
    val set = setOf("Madrid", "São Paulo", "Berlim")
    val s11: Set<Int> = setOf(1, 2)

    // Cria um set mutável com elementos repetidos
    val setMutavel = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8)

    // imprime o set
    println(setMutavel)

    // adicionando mais elementos
    setMutavel.add(5)
    setMutavel.add(5)
    setMutavel.add(5)
    setMutavel.add(5)

    // Elementos unicos - não repetidos
    println(setMutavel)

    // Removendo um valor
    setMutavel.remove(5)

    // verifica se existe o valor
    println(setMutavel.contains(5))

    // Limpando a colecao
    setMutavel.clear()
}
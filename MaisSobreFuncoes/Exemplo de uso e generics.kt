package MaisSobreFuncoes

fun main() {
    println(media2(false, 10f, 8f, 2, "afas", false, 2f))

    arrayOf(2, 3, 1, 5, 40f, false)
    "afasfaf".startsWith("as")
}

fun <T, J> media2(abc: J, vararg notas: T): Float { // vararg so funciona se tiver como ultimo paramentro da funcao
    var soma = 0f

    for (i in notas) {
        if (i is Float) {
            soma += i
        }

    }

    return soma / notas.size
}
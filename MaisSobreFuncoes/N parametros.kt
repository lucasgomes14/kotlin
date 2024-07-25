package MaisSobreFuncoes

fun main() {
    println(media(10f, 8f))
}

fun media(vararg notas: Float): Float {
    var soma = 0f

    for (i in notas) {
        soma += i
    }

    return (soma / notas.size)
}
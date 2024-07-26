package ColecoesEFuncoes

// take(quantidade) a quantidade de primeiros item
// takelast(quantidade) a quantidade de ultimos item

fun main() {
    val data = geraDados()

    println(data.take(2))
    println(data.takeLast(2))
}
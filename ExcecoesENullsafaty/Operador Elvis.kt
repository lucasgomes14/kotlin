package ExcecoesENullsafaty

fun main() {
    val str: String? = null

    if (str == null) {
        println("nulo")
    } else {
        println(str)
    }

    println(str ?: "null") // se for nulo aplica a operação que esta dps o operador ?:

    // Kotlin não tem operador ternário

    val idade = 18
    val str2 = if (idade > 18) "Maior de idade" else "Menor de idade" // Mesma coisa de operador ternário
}
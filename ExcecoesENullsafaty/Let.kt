package ExcecoesENullsafaty

fun main() {
    val str: String? = null

    str?.let { // if else desfarçado; só executa se for diferente de nulo
        // corpo
        println("STR não nulo")
        it.lowercase()
        it.uppercase()  // usa a variável que não é nula com a palavra it
    }
}
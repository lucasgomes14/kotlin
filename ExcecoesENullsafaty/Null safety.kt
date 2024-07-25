package ExcecoesENullsafaty

//tenta previnir erros de variaveis nulas

fun main() {
    var s: String? = null // ? deixa a variável atribuir null
    println(s?.length) // não tem o nullpointerexception; trata caso aja problema
    //println(s!!.length) // assumo o erro

    var abc = readLine()

    println(abc?.length)
}
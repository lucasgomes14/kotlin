package Funcoes

fun main() {
    age(2)
    println(quantidadeStr("Lucas"))
    println(cubo(5))
    println(milhasParaKm(5f))
    trocaDeLetra("Lucas LUCAS")
}

fun age(age: Int) {
    val month = age * 12
    println("${age} meses")

    val days = age * 365
    println("${days} dias")

    val hours = days * 24
    println("${hours} horas")

    val minute = hours * 60
    println("${minute} minutos")

    val seconds = minute * 60
    println("${seconds} segundos")
}

fun quantidadeStr(string: String) = string.length


fun cubo(numero: Int) = numero * numero * numero

fun milhasParaKm(milhas: Float) = milhas * 1.6

fun trocaDeLetra(frase: String) {
    val newFrase = frase.replace("a", "x", true).lowercase()
    println(newFrase)
}
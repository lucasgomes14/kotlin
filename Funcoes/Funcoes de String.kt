package Funcoes

fun main() {
    val str = "Programação Kotlin."

    println(str.length)
    println("Posição (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 5))
    println(str.replace("Kotlin", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())
    println("             meu nome é         ".trim())
}
package Funcoes

fun main() {
    helloWorld()
    println("A soma de 10 e 5 é:  ${sum(10, 5)}")
}

fun helloWorld(): Unit {
    println("Hello, World!")
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}
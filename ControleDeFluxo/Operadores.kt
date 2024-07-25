package ControleDeFluxo

fun main() {
    val n = 1
    if(n >= 1 && n <= 50) {
        println("Dentro")
    }

    if(n in 1..50) {
        println("Dentro")
    }
}
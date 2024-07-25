package ControleDeFluxo

fun main() {
    for(i in 1..10) {
        println(i)
    }

    val str = "Kotlin é show!"

    for(char in str) {
        print("${char}")
    }
    println()

    for(j in 0..20 step 2) {
        print("$j ")
    }

    println()

    for(k in 20 downTo 0 step 3) {
        print("$k ")
    }
}
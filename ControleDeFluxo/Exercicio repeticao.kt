package ControleDeFluxo

fun main() {
    repeticaoNumero1()
    println()
    repeticaoNumero2()
    println()
    repeticaoNumero3()
    println()
    println(repeticaoNumero4())
    println()
    repeticaoNumero5(5)
    println()
    println(repeticaoNumero6())
    println()
    repeticaoNumero7()
    println()
    repeticaoNumero8("Meu nome é Julius")
    println()
    println(repeticaoNumero9("xooxxo"))
    println()
    println(repeticaoNumero9("xooxxoo"))
}

fun repeticaoNumero1() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun repeticaoNumero2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun repeticaoNumero3() {
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }
}

fun repeticaoNumero4(): Int {
    var count = 0
    for (i in 1..500) {
        count += i
    }
    return count
}

fun repeticaoNumero5(quantidade: Int) {
    for (i in 1..quantidade) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun repeticaoNumero6(): Int {
    var caixa = 0
    var contador = 0

    while (caixa < 2000) {
        caixa += 7
        if (caixa < 2000) contador++
    }

    return contador
}

fun repeticaoNumero7() {
    var i = 1

    while (i <= 50) {
        if (i % 3 == 0 && i % 5 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun repeticaoNumero8(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print("${str[i]}")
        i--
    }
}

fun repeticaoNumero9(str: String): Boolean {
    var contadorX = 0
    var contadorO = 0

    var i = 0

    while (i < str.length) {
        if(str[i] == 'x') contadorX++
        else if(str[i] == 'o') contadorO++
        i++
    }

    return contadorX == contadorO
}
package ControleDeFluxo

fun main() {
    maiorDeIdade(18)
    maiorDeIdade(16)
    maiorDeIdade(60)
    maiorDeIdade(10)
    println(saudacao(true))
}

fun maiorDeIdade(idade: Int) {
    if(idade >= 18) {
        println("Maior de idade")
        if(idade >= 60) {
            println("Terceira idade")
        }
    } else if(idade <= 10) {
        println("Criança")
    } else {
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean): String {
    return if(dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}
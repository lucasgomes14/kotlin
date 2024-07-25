package ControleDeFluxo

fun main() {
    numero1()
    numero2()


    numero3(18, "Comum", "XT00")
    numero3(18, "luxo", "XT00")
    numero3(18, "premium", "XT00")
    numero3(17, "Comum", "XT00")
    numero3(18, "Comum", "Xx00")
}

fun numero1() {
    val lado1 = readLine()
    val lado2 = readLine()

    if(lado1 != null && lado2 != null && lado1 != "" && lado2 !="") {
        if(lado1.toInt() == lado2.toInt()) {
            println("Quadrado")
        } else {
            println("Não é quadrado")
        }
    }
}

fun numero2() {
    val lado1 = readLine()
    val lado2 = readLine()
    val lado3 = readLine()

    if(lado1 != null && lado2 != null && lado3 != null && lado1 != "" && lado2 !="" && lado3 != "") {
        if(lado1.toInt() == lado2.toInt() &&  lado2.toInt() == lado3.toInt()) {
            println("Triângulo equilátero")
        } else {
            println("Não é triângulo equilátero")
        }
    }
}

fun numero3(idade: Int, tipo: String, codigo: String) {
    if(idade < 18) {
        println("Negado. Menores de idade não são permitidos.")
    } else if(tipo.lowercase() != "comum" && tipo.lowercase() != "premium" && tipo.lowercase() != "luxo") {
        println("Negado. Convite inválido")
    } else if(codigo.substring(0,2) != "XL" && codigo.substring(0,2) != "XT") {
        println("Negado. Convite inválido")
    } else {
        println("Welcome")
    }
}
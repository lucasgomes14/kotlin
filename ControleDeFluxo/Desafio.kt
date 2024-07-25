package ControleDeFluxo

fun main() {
    desafioFluxos()
}

fun desafioFluxos() {
    val salario = 10000f
    var ana = 0f
    var paula = 0f

    var meses = 0

    while (ana >= paula) {
        ana += (salario * .05f * 2) + (ana * 0.002f)
        paula += (salario * .05f) + (paula * 0.008f)
        meses ++
    }
    println(meses)
}
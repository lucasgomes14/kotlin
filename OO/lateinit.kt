package OO

class Receita() {
    lateinit var instrucoes: String

    fun gerarReceita() {
        instrucoes = "Lava as mãos."
    }

    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized) {
            instrucoes = "Lave as m"
        }
    }
}

fun main() {
    var r: Receita = Receita()

    r.imprimeReceita()
    println(r.instrucoes)
    r.gerarReceita()
    println(r.instrucoes)
}
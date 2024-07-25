package OO

class Vazia
//class Vazia private constructor()

                // construtor primário
class Pessoa2(val anoNascimento: Int, var nome: String) {
    var doc: String? = null

    // construtor secundário
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }

}

// diferença que o primário não consegue colocar logica dentro e o secundario sim

fun main() {
    Vazia()
    var pessoa: Pessoa2 = Pessoa2(2000, "Fulado", "231435464")
}
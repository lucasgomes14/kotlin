package OO

class Pessoa(val anoNascimento: Int = 2020, var nome: String) {

    var olhos: String = ""
    fun dormir() {

    }

    fun acordar() {

    }
}

fun main() {
    // class - comportamento e atributos

    // class -> objetos
    var pessoa: Pessoa = Pessoa(2000, "Fulado") // instanciando

    pessoa.nome
    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos
    pessoa.olhos = "adadsd"
}
package Heranca

/**
 * A classe abstrata define alguns comportamentos que as classes que herdam devem ter.
 * Uma classe abstrata não pode ser instanciada, é usada para moldar classes que herdam seu comportamento.
 * Uma classe abstrata deve ter no mínimo um método abstrato. Assim, podem existir métodos já implementados.
 */


abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("afaf")
    }


    fun dormir() {
        println("fafa")
    }


    abstract fun falar()
}


/**
 * Herda de mamífero
 * Implementa obrigatoriamente a função definida como abstrata na classe pai.
 * Não precisa implementar métodos que não são definidos como abstratos, mas poderia com o uso do override.
 */


class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("au au")
    }
}


fun main() {
    var c = Cachorro("Bolt")


    // classe abstrada não pode ser instanciada
    // var t = Mamifero("Sfaf")
}

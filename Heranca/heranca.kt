package Heranca

open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {
    val c: Computador = Computador("DELL")

    c.ligar()
    c.desligar()
    c.processar()
    c.instalarSoftware()
    c.marca
}
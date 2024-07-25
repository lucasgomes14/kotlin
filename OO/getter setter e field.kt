package OO

class Animal2(var especie: String) {
    var fala: String = ""

        get() {
            println("Acesso get")
            return field
        }

        set(value) {
            println("Acesso set")
            field = value
        }
}

fun main() {
    // kotlin ja tem por padrao o get e set, so usa ele caso tenho codigo a mais no bloco de codigo
    // field é para referenciar a variavel e não fazer um loop infinito

    var a = Animal2("cachorro")
    a.fala = "auuuuu"
    a.fala
}
package OO

class Animal(var especie: String) {
    var fala: String = ""

    init {
        fala = if (especie == "cachorro") {
            "au"
        } else if (especie == "gato") {
            "miau"
        } else {
            ""
        }
    }

    fun falar() {
        println(fala)
    }
}

fun main() {
    // init é um codigo que é executado quando a classe é instanciada
    Animal("cachorro").falar()
    Animal("gato").falar()
    Animal("").falar()
}
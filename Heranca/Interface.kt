package Heranca

/**
 * Interfaces podem conter declarações de métodos que serão sobrescritos e também métodos com implementação.
 * Os métodos que serão sobrescritos precisam estar com assinatura e tipo de retorno definido,
 * não há necessidade de haver corpo.
 *
 * A diferença de interface com classe abstrata é que interfaces não podem armazenar estados.
 * Ou seja, os atributos da classe não podem ter valores.
 * */


fun main() {

}


interface interface1 {
    fun ola()
}


interface interface2 {
    fun ola2() {
        println("Olá interface 2")
    }


    fun tchau()
}


class implementsInterface() : interface1, interface2 {
    override fun ola() {
        println("sobrescrita")
    }


    override fun tchau() {
        println("Tchau interface 2")
    }
}

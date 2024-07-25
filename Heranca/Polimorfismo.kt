package Heranca

interface Funcionario {
    fun bonus()
}


class Gerente() : Funcionario {
    override fun bonus() {
        println("Bonus do gerente")
    }
}


class Analista() : Funcionario {
    override fun bonus() {
        println("Bonus do analista")
    }
}


fun calculo(func: Funcionario) {
    func.bonus()
}


fun main() {
    val gerente = Gerente()
    val analista = Analista()

    calculo(gerente)
    calculo(analista)
}

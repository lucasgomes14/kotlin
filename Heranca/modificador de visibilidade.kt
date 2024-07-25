package Heranca

/**
 * Modificadores: public, private, protected
 * ---
 * public
 * Aberto para classes herdeiras e não herdeiras. Visibilidade ilimitada.
 * --
 * private
 * Visibilidade somente dentro da classe.
 * --
 * protected
 * Visibilidade para a classe onde é declarada e classes herdeiras.
 */

open class Figura() {
    protected fun funcaoProtected() {}

    private fun funcaoPrivate() {}
}

class Quadrado(lado: Int) : Figura() {
    fun area() {
        funcaoProtected()

        // nao acessivel
        // funcaoPrivate()
    }
}

fun main() {
    val fig: Figura = Figura()

    // Nao acessivel
    // fig.funcaoProtected()
    // fig.funcaoPrivate()
}
package ExcecoesENullsafaty

fun main() {
    try {
        val s: String? = null
        val a = 10 / 0

        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variável nula!")
    } catch (e: ArithmeticException) {
        println("Divisão por 0")
    } catch (e: Exception) { // a mais genérica possível; usar por ultimo catch
        println("Genérica")
    } finally {
        println("Finally")
    }

    println("Fim!")
}
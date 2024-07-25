package OO

fun main() {
    // objeto(f1) -> end mem1
    // objeto(f2) -> end mem2

    // data class traz funcionalidades dos 3(equals, toString, hashCode)
    // data class é usado quando não tem comportamento e a classe vai ser usada pra transitar valores

    val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-------------")
    println(f2.toString())
    println(f2.hashCode())

    // f2 = f1 aponta apenas para o mesmo endereco da memoria

    println("-------------")

    val f3: FormaData = FormaData(10, 8)
    var f4: FormaData = FormaData(10, 8)
    println(f3.equals(f4))
    println(f3.toString())
    println(f3.hashCode())
    println("-------------")
    println(f4.toString())
    println(f4.hashCode())

    f4 = f3.copy() // f4 = f3.copy(203, 4564) copia os valores ou os novos
}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }

    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

data class FormaData(val a: Int, val b: Int)

data class Endereco(val rua: String, val cep: String, val city: String)
fun endereco(e: Endereco) {}
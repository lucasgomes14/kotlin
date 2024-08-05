package MaisSobreKotlin_Lambda

/**
 * Sintaxe Lambda
 *
 * { Parâmetros -> corpo }
 * { x: Int -> println(x) }
 * { x: Int, y: Int -> println(x + y) }
 *
 * Lambdas pode ser  passados por parâmetros, ou seja,
 * comportamentos podem ser passados por parâmetros.
 *
 */

fun main() {
    val a: () -> Unit = { println("Sou um lambda") }
    a()

    val a1 = { println("Sou um lambda") }
    a1()

    val b: (Int) -> Int = { x: Int -> x * 2 }
    b(10)

    val b1 = { x: Int -> x * 2 }
    b1(10)

    val c: (Int, Int) -> Int = { x: Int, y: Int -> (x + y) }
    c(2, 2)

    val c1 = { x: Int, y: Int -> (x + y) }
    c1(2, 2)

    receiveLambda1 { println("Hello world!") }
    receiveLambda2 { 5 }
    receiveLambda3 {x, y ->
        println("Teste")
        x + y // A ultima linha de um lambda é o retorno
    }
}

fun receiveLambda1(p: () -> Unit) {
    p()
}

fun receiveLambda2(p: (x: Int) -> Int) {
    p(10)
}

fun receiveLambda3(p: (x:Int, y:Int) -> Int) {
    p(10, 20)
}
package ControleDeFluxo

// when = quando
// switch

fun main() {
    println(BonusWhen("gerente"))

    val n = 10

    when(n) {
        in 1..10 -> println("1..10")
        in 11..100 -> println("11..100")
    }

    val m = true

    when(m) {
        true -> println("True")
        false -> println("False")
    }
}

fun BonusWhen(cargo: String): Float {
    var bonus = 0f

    /*val bonus =*//*return*/when(cargo.lowercase()) {
        "gerente" -> {
            bonus = 2000f
        }

        "coordenador" -> bonus = 1500f

        "engenheiro" -> bonus = 1000f

        "estagiário" -> bonus = 500f

        else -> bonus = 0f // default
    }

    return bonus
}
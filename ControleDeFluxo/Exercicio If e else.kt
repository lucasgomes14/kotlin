package ControleDeFluxo

fun main() {
    funcionario("gerente", 2)
    funcionario("coordenador", 1)
    funcionario("engenheiro", 0)
    funcionario("estagiário", 0)
    funcionario("", 0)
}

fun funcionario(cargo: String, experiencia: Int) {
    if(cargo.lowercase() == "gerente") {
        if(experiencia < 2) {
            println(2000.00f)
        }
        println(3000.00f)
    } else if(cargo.lowercase() == "coordenador") {
        if(experiencia < 1) {

        println(1500.00f)
        }
        println(1800.00f)
    } else if(cargo.lowercase() == "engenheiro") {
        println(1000.00f)
    } else if(cargo.lowercase() == "estagiário"){
        println(500.00f)
    } else {
        println(0.0f)
    }
}
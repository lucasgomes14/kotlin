package ControleDeFluxo

fun main() {

    val str = "afafff afafasf  afa"
    var i = 0
    while (i < 80) {
        if(i < 50) {
            i++
            continue
        }
        print("$i ")
        i++
    }
}
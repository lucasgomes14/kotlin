package OO

fun main() {
    val pessoaCriadaParaExecucaoDeTestes = Pessoa(1985, "Frank")
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    with(pessoaCriadaParaExecucaoDeTestes) {
        acordar()
        dormir()
        olhos
    }
}
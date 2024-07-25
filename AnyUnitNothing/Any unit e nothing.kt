package AnyUnitNothing

fun main() {
    // todos os tipos são descendente de Any
    tipoAny(1)
    tipoAny(1.0)
    tipoAny(1f)
    tipoAny("a")
    tipoAny(false)

    //unit é quando não tem retorno
    //nothing é quando vai retornar nada, usado para retornar exceção
}

fun tipoAny(valor: Any): Unit {

}
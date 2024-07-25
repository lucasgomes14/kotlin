package MaisSobreFuncoes

fun main() {
    endereco("abc", "Esperanca", "Paraiba", "1515", 2)
    endereco("abc", "Esperanca", "Paraiba", "1515")
    endereco(cidade = "abc", estado = "Paraiba", cep = "1515", rua = "afasf")
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", numero: Int = 0) { // numero com valor default

}
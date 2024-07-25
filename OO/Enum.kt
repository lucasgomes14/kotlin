package OO

enum class Prioridade {
    Baixo, Media, Alta
}

enum class Prioridade2(val id: Int) {
    Baixo(1) {
        override fun toString(): String {
            return "Prioridade baixa: $id"
        }
    },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca, Tartaruga
}

/*
* fun portariaEnum(tipoConvite: Prioridade) {

}
* */

fun main() {
    // portariaEnum(Prioridade.Alta)

    for (i in Prioridade.values()) {
        println(i)
    }

    for (i in Prioridade2.values()) {
        println(i.id)
    }

    for (i in Prioridade2.values()) {
        println(i)
    }
}
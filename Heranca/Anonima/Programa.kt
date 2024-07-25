package Heranca.Anonima

class Programa {
    fun salvar(event: Event) {
        println("Abrindo conexao")
        println("Salvando valores")
        println("Sucesso. Conexao fechada")
        event.onClose()
    }
}

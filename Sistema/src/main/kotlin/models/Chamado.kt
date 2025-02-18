package models

class Chamado(
    private var id: Int,
    private val nome: String,
    private var descricao: String,
    private var status: String = "Aberto",
    private var prioridade: String,
    private var cliente: Cliente,
    private var tecnico: Tecnico,
    private var dataAbertura: String,
    private var dataConclusao: String? = null
){
    private fun estadoAtual(): String{

        val statusAtual:String = when(this.status){
            "Aberto" -> "Na fila"
            "Andamento" -> "Esta sendo atendido"
            else -> "Concluido na data ${this.dataConclusao}"
        }

        return statusAtual
    }

    override fun toString(): String {
        return ("Id: ${this.id} | Nome: ${this.nome} | Status: ${this.status} | Prioridade: ${this.prioridade}\n" +
                "Cliente: ${this.cliente.nome} | Técnico: ${this.tecnico.nome}\n" +
                "Descrição: ${this.descricao}\n" +
                "Aberto no dia ${this.dataAbertura} | ${this.estadoAtual()}\n")
    }
}

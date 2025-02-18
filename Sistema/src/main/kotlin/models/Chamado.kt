package models

class Chamado(
    var id: Int,
    val nome: String,
    var descricao: String,
    var status: String = "Aberto",
    var prioridade: String,
    var cliente: Cliente,
    var tecnico: Tecnico,
    var dataAbertura: String,
    var dataConclusao: String? = null
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

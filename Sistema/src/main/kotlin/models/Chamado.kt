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
    fun getStatus(): String{

        val statusAtual:String = when(this.status){
            "Aberto" -> "Na fila"
            "Andamento" -> "Em atendimento"
            else -> "Finalizado na data ${this.dataConclusao}"
        }

        return statusAtual
    }

    fun setStatus(status: String){
        if ((status != "") && ((status != "Aberto") || (status != "Andamento") || (status != "Finalizado"))){
            println("valor '${status}' não é válido para este campo!")
        } else{
            this.status = status
        }
    }

    override fun toString(): String {
        return ("Id: ${this.id} | Nome: ${this.nome} | Status: ${this.status} | Prioridade: ${this.prioridade}\n" +
                "Cliente: ${cliente.nome} | Técnico: ${tecnico.nome}\n" +
                "Descrição: ${this.descricao}\n" +
                "Aberto no dia ${this.dataAbertura} | ${this.getStatus()}\n")
    }
}

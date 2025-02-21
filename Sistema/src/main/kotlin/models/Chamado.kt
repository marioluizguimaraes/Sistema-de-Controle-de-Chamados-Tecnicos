package models

class Chamado(
    private var id: Int,
    private val nome: String,
    private var descricao: String,
    private var status: String,
    private var prioridade: String,
    private var idCliente: Int,
    private var idTecnico: Int,
    private var dataAbertura: String,
    private var dataConclusao: String?
){
    fun getStatus(): String{
        return this.status
    }

    fun setStatus(status: String){
        this.status = status
    }
    fun getIdChamado(): Int{
        return this.id
    }

    override fun toString(): String {
        return ("Id: ${this.id} | Nome: ${this.nome} | Status: ${this.status} | Prioridade: ${this.prioridade}\n" +
                "Cliente: ${idCliente} | Técnico: ${idTecnico}\n" +
                "Descrição: ${this.descricao}\n" +
                "Aberto no dia ${this.dataAbertura} | ${this.getStatus()}\n")
    }
}

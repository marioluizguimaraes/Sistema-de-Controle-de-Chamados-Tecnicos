package models

class Chamado(
    var id: Int,
    var nome: String,
    var descricao: String,
    var status: String,
    private var prioridade: String,
    private var idCliente: Int,
    var idTecnico: Int,
    private var dataAbertura: String,
    private var dataConclusao: String?
) {

    override fun toString(): String {
        return ("Id: ${this.id} | Nome: ${this.nome} | Status: ${this.status} | Prioridade: ${this.prioridade}\n" +
                "Cliente: ${idCliente} | Técnico: ${idTecnico}\n" +
                "Descrição: ${this.descricao}\n" +
                "Aberto no dia ${this.dataAbertura} | ${this.status}\n") // Chamando status diretamente
    }

    // Falta adicionar a função para inserir chamados na lista de chamados do cliente e técnico
}

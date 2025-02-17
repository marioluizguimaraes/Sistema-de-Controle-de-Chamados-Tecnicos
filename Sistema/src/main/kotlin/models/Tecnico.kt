package models

class Tecnico(
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    var especialidade: String
) : Pessoa(nome, cpf, email, telefone) {

    fun atenderChamado(chamado: Chamado) {
        chamado.status = "Em atendimento"
    }
}
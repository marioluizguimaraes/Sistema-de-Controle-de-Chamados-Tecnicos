package models

class Tecnico(
    var id: Int,
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    var especialidade: String
) : Pessoa(nome, cpf, email, telefone) {

    override  fun toString(): String{
        return ("Id: ${this.id} Nome: ${this.nome}, CPF: ${this.cpf}, Email: ${this.email}, Telefone: ${this.telefone}, Especialidade: ${this.especialidade}\n")
    }
}
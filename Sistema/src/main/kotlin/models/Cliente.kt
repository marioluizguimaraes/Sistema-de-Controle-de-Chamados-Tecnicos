package models


class Cliente(
    val id: Int,
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    var endereco: String
) : Pessoa(nome, cpf, email, telefone) {

    override  fun toString(): String{
        return ("Id: ${this.id} Nome: ${this.nome}, CPF: ${this.cpf}, Email: ${this.email}, Telefone: ${this.telefone}, Endereço: ${this.endereco}\n")
    }
}
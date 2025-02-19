package models

class Tecnico(
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    val especialidade: String
) : Pessoa(nome, cpf, email, telefone) {

    override  fun toString(): String{
        return ("Nome: ${this.nome}, CPF: ${this.cpf}, Email: ${this.email}, Telefone: ${this.telefone}, Especialidade: ${this.especialidade}\n")
    }

}
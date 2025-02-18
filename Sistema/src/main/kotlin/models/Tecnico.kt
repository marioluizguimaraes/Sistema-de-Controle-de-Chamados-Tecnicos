package models

class Tecnico(
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    val especialidade: String
) : Pessoa(nome, cpf, email, telefone) {

}
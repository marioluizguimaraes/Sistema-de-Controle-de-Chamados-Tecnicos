package models

import java.util.*

class Cliente(
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    var endereco: String
) : Pessoa(nome, cpf, email, telefone) {

}
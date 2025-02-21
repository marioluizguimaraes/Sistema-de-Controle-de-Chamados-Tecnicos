package models


class Cliente(
    val id: Int,
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    var endereco: String,
    val chamados: MutableList<Int> = mutableListOf()
) : Pessoa(nome, cpf, email, telefone) {

    override  fun toString(): String{
        return ("Id: ${this.id} Nome: ${this.nome}, CPF: ${this.cpf}, Email: ${this.email}, Telefone: ${this.telefone}, Endereço: ${this.endereco}\n")
    }

    fun getIdChamados(): MutableList<Int>{
        return this.chamados
    }

    fun setChamados(chamado: Int){
        this.chamados.add(chamado)
    }
}
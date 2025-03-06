package view

import models.Chamado
import models.Cliente
import models.Tecnico

object Forms {

    fun novoCliente(): Cliente {
        val id = 0
        val nome = inputText("Digite o nome do cliente: ")
        val cpf = inputText("Digite o CPF do cliente: ")
        val email = inputText("Digite o email do cliente: ")
        val telefone = inputText("Digite o telefone do cliente: ")
        val endereco = inputText("Digite o endereço do cliente: ")

        println("Cliente cadastrado com sucesso!")
        return Cliente(id, nome, cpf, email, telefone, endereco)
    }

    fun novoTecnico(): Tecnico {
        val id = 0
        val nome = inputText("Digite o nome do Técnico: ")
        val cpf = inputText("Digite o CPF do Técnico: ")
        val email = inputText("Digite o email do Técnico: ")
        val telefone = inputText("Digite o telefone do Técnico: ")
        val especialidade = inputText("Digite a especialidade do Técnico: ")

        println("Técnico cadastrado com sucesso!")
        return Tecnico(id, nome, cpf, email, telefone, especialidade)
    }

    fun novoChamado(): Chamado {
        val id = 0
        val nome = inputText("Digite o nome do chamado: ")
        val descricao = inputText("Digite a descrição do chamado: ")
        val idCliente = inputId("Digite o ID do Cliente: ")
        val idTecnico = inputId("Digite o ID do Técnico: ")
        val prioridade = inputPrioridade()
        val status = "Aberto"
        val dataAbertura = ""
        val dataConclusao: String? = null

        println("Chamado cadastrado com sucesso!")
        return Chamado(id, nome, descricao, status, prioridade, idCliente, idTecnico, dataAbertura, dataConclusao)
    }

    fun inputId(placeholder: String): Int {
        while (true) {
            print(placeholder)
            val input = readlnOrNull()?.toIntOrNull()
            if (input != null){
                return input
            }
            println("⚠ ID inválido! Tente novamente!")
        }
    }

    fun inputText(placeholder: String): String {
        while (true) {
            print(placeholder)
            val input = readlnOrNull()?.trim()
            if (!input.isNullOrEmpty()){
                return input
            }
            println("⚠ Campo inválido! Tente novamente!")
        }
    }

    fun inputPrioridade(): String {
        val opcoesValidas = listOf("Alta", "Média", "Baixa")
        while (true) {
            print("Digite o nível de prioridade (Alta, Média, Baixa): ")
            val input = readlnOrNull()?.trim()
            if (!input.isNullOrEmpty() && input in opcoesValidas) {
                return input
            }
            println("⚠ Prioridade inválida! Escolha entre Alta, Média ou Baixa.")
        }
    }
}
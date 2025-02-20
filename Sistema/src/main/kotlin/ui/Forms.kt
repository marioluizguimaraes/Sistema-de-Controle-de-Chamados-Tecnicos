package ui

import models.Cliente
import models.Tecnico

object Forms {
    fun cliente(): Cliente{
        var id: Int = -1
        var nome: String = ""
        var cpf: String = ""
        var email: String = ""
        var telefone: String = ""
        var endereco: String = ""

        while (id == -1) {
            print("Digite o ID do cliente: ")
            val inputId = readlnOrNull()
            if (inputId != null) {
                val parsedId = inputId.toIntOrNull()
                if (parsedId != null) {
                    id = parsedId
                } else {
                    println("ID inválido. Tente novamente.")
                }
            } else {
                println("Entrada inválida. Tente novamente.")
            }
        }

        while (nome.isEmpty()) {
            print("Digite o nome do cliente: ")
            nome = readlnOrNull() ?: ""
            if (nome.isEmpty()) {
                println("Nome inválido. Tente novamente.")
            }
        }

        while (cpf.isEmpty()) {
            print("Digite o CPF do cliente: ")
            cpf = readlnOrNull() ?: ""
            if (cpf.isEmpty()) {
                println("CPF inválido. Tente novamente.")
            }
        }

        while (email.isEmpty()) {
            print("Digite o email do cliente: ")
            email = readlnOrNull() ?: ""
            if (email.isEmpty()) {
                println("Email inválido. Tente novamente.")
            }
        }

        while (telefone.isEmpty()) {
            print("Digite o telefone do cliente: ")
            telefone = readlnOrNull() ?: ""
            if (telefone.isEmpty()) {
                println("Telefone inválido. Tente novamente.")
            }
        }

        while (endereco.isEmpty()) {
            print("Digite o endereço do cliente: ")
            endereco = readlnOrNull() ?: ""
            if (endereco.isEmpty()) {
                println("Endereço inválido. Tente novamente.")
            }
        }
        println("Cliente cadastrado com sucesso!")
        return Cliente(id, nome, cpf, email, telefone, endereco)
    }

    fun tecnico(): Tecnico {
        var id: Int = -1
        var nome: String = ""
        var cpf: String = ""
        var email: String = ""
        var telefone: String = ""
        var especialidade: String = ""

        while (id == -1) {
            print("Digite o ID do Técnico: ")
            val inputId = readlnOrNull()
            if (inputId != null) {
                val parsedId = inputId.toIntOrNull()
                if (parsedId != null) {
                    id = parsedId
                } else {
                    println("ID inválido! Tente novamente!")
                }
            } else {
                println("Entrada inválida! Tente novamente!")
            }
        }

        while (nome.isEmpty()) {
            print("Digite o nome do Técnico: ")
            nome = readlnOrNull() ?: ""
            if (nome.isEmpty()) {
                println("Nome inválido. Tente novamente.")
            }
        }

        while (cpf.isEmpty()) {
            print("Digite o CPF do Técnico: ")
            cpf = readlnOrNull() ?: ""
            if (cpf.isEmpty()) {
                println("CPF inválido. Tente novamente.")
            }
        }

        while (email.isEmpty()) {
            print("Digite o email do Técnico: ")
            email = readlnOrNull() ?: ""
            if (email.isEmpty()) {
                println("Email inválido. Tente novamente.")
            }
        }

        while (telefone.isEmpty()) {
            print("Digite o telefone do Técnico: ")
            telefone = readlnOrNull() ?: ""
            if (telefone.isEmpty()) {
                println("Telefone inválido! Tente novamente!")
            }
        }

        while (especialidade.isEmpty()) {
            print("Digite o endereço do Técnico: ")
            especialidade = readlnOrNull() ?: ""
            if (especialidade.isEmpty()) {
                println("Especialidade inválida! Tente novamente!")
            }
        }

        return Tecnico(id, nome, cpf, email, telefone, especialidade)
    }
}
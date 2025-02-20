package ui

import models.Chamado
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
            val inputId = readln()
            if (inputId != null) {
                val parsedId = inputId.toInt()
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
            nome = readln() ?: ""
            if (nome.isEmpty()) {
                println("Nome inválido. Tente novamente.")
            }
        }

        while (cpf.isEmpty()) {
            print("Digite o CPF do cliente: ")
            cpf = readln() ?: ""
            if (cpf.isEmpty()) {
                println("CPF inválido. Tente novamente.")
            }
        }

        while (email.isEmpty()) {
            print("Digite o email do cliente: ")
            email = readln() ?: ""
            if (email.isEmpty()) {
                println("Email inválido. Tente novamente.")
            }
        }

        while (telefone.isEmpty()) {
            print("Digite o telefone do cliente: ")
            telefone = readln() ?: ""
            if (telefone.isEmpty()) {
                println("Telefone inválido. Tente novamente.")
            }
        }

        while (endereco.isEmpty()) {
            print("Digite o endereço do cliente: ")
            endereco = readln() ?: ""
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
            val inputId = readln()
            if (inputId != null) {
                val parsedId = inputId.toInt()
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
            nome = readln() ?: ""
            if (nome.isEmpty()) {
                println("Nome inválido! Tente novamente!")
            }
        }

        while (cpf.isEmpty()) {
            print("Digite o CPF do Técnico: ")
            cpf = readln() ?: ""
            if (cpf.isEmpty()) {
                println("CPF inválido! Tente novamente!")
            }
        }

        while (email.isEmpty()) {
            print("Digite o email do Técnico: ")
            email = readln() ?: ""
            if (email.isEmpty()) {
                println("Email inválido! Tente novamente!")
            }
        }

        while (telefone.isEmpty()) {
            print("Digite o telefone do Técnico: ")
            telefone = readln() ?: ""
            if (telefone.isEmpty()) {
                println("Telefone inválido! Tente novamente!")
            }
        }

        while (especialidade.isEmpty()) {
            print("Digite o endereço do Técnico: ")
            especialidade = readln() ?: ""
            if (especialidade.isEmpty()) {
                println("Especialidade inválida! Tente novamente!")
            }
        }

        return Tecnico(id, nome, cpf, email, telefone, especialidade)
    }

    fun chamado(): Chamado {
        var id: Int = -1
        var nome: String = ""
        var descricao: String = ""
        var status: String = "Aberto"
        var prioridade: String = ""
        var idCliente: Int = -1
        var idTecnico: Int = -1
        var dataAbertura: String =""
        var dataConclusao: String? = null

        while (id == -1) {
            print("Digite o ID do chamado: ")
            val inputId = readln()
            if (inputId != null) {
                val parsedId = inputId.toInt()
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
            print("Digite o nome do chamado: ")
            nome = readlnOrNull() ?: ""
            if (nome.isEmpty()) {
                println("Nome inválido! Tente novamente!")
            }
        }

        while (idCliente == -1) {
            print("Digite o ID do Cliente: ")
            val inputIdCliente = readln()
            if (inputIdCliente != null) {
                val parsedId = inputIdCliente.toIntOrNull()
                if (parsedId != null) {
                    idCliente = parsedId
                } else {
                    println("ID inválido! Tente novamente!")
                }
            } else {
                println("Entrada inválida! Tente novamente!")
            }
        }

        while (idTecnico == -1) {
            print("Digite o ID do Técnico: ")
            val inputIdTecnico = readln()
            if (inputIdTecnico != null) {
                val parsedId = inputIdTecnico.toInt()
                if (parsedId != null) {
                    idTecnico = parsedId
                } else {
                    println("ID inválido! Tente novamente!")
                }
            } else {
                println("Entrada inválida! Tente novamente!")
            }
        }

        while (descricao.isEmpty()) {
            print("Digite a descrição do chamado: ")
            descricao = readln() ?: ""
            if (descricao.isEmpty()) {
                println("Descrição inválido! Tente novamente!")
            }
        }

        while (status.isEmpty()) {
            print("Digite o status atual do chamado: ")
            status = readln() ?: ""
            if (status.isEmpty()) {
                println("Status inválido! Tente novamente!")
            }
        }

        while (prioridade.isEmpty()) {
            print("Digite qual é o nivel de prioridade do chamado: ")
            prioridade = readln() ?: ""
            if (prioridade.isEmpty() || (prioridade != "Alta" && prioridade != "Média" && prioridade != "Baixa")) {
                prioridade = ""
                println("Prioridade inválido! Tente novamente!")
            }
        }

        return Chamado(id, nome, descricao, status, prioridade, idCliente, idTecnico, dataAbertura, dataConclusao)
    }

}
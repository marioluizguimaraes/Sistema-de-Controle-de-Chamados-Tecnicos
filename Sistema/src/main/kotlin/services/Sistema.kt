package services

import models.Chamado
import models.Cliente
import models.Tecnico

class SistemaChamados {
    private val clientes = mutableListOf<Cliente>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val chamados = mutableListOf<Chamado>()

    fun cadastrarCliente() {
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

        clientes.add(Cliente(id, nome, cpf, email, telefone, endereco))
        println("Cliente cadastrado com sucesso!")
    }

    fun cadastrarTecnico() {
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

        tecnicos.add(Tecnico(id, nome, cpf, email, telefone, especialidade))
    }

    fun cadastrarChamado(chamado: Chamado){
        chamados.add(chamado)
    }

    fun listarChamados(): String{
        val chamadoList = StringBuilder()
        for (chamado in chamados){
            chamadoList.append(chamado.toString())
        }
        return chamadoList.toString()
    }

    fun listarClientes(): String {
        val clientesList = StringBuilder()
        for (cliente in clientes) {
            clientesList.append("> ${cliente.toString()}")
        }
        return clientesList.toString()
    }

    fun listarTecnicos(): String {
        val tecnicosList = StringBuilder()
        for (tecnico in tecnicos) {
            tecnicosList.append("> ${tecnico.toString()}")
        }
        return tecnicosList.toString()
    }

    private fun validaCPF(cpf:String): Boolean{
        
        if ( ){
            return true
        }
        else{
            return false
        }

    }
}
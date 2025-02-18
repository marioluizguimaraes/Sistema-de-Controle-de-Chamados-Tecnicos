package services

import models.Chamado
import models.Cliente
import models.Tecnico

class SistemaChamados {
    private val clientes = mutableListOf<Cliente>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val chamados = mutableListOf<Chamado>()

    fun cadastrarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun cadastrarTecnico(tecnico: Tecnico) {
        tecnicos.add(tecnico)
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
            clientesList.append("Nome: ${cliente.nome}, CPF: ${cliente.cpf}, Email: ${cliente.email}, Telefone: ${cliente.telefone}, Endereço: ${cliente.endereco}\n")
        }
        return clientesList.toString()
    }

    fun listarTecnicos(): String {
        val tecnicosList = StringBuilder()
        for (tecnico in tecnicos) {
            tecnicosList.append("Nome: ${tecnico.nome}, CPF: ${tecnico.cpf}, Email: ${tecnico.email}, Telefone: ${tecnico.telefone}, Especialidade: ${tecnico.especialidade}\n")
        }
        return tecnicosList.toString()
    }
}
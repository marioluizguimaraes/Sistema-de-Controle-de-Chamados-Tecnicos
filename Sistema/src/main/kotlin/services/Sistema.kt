package services

import models.Chamado
import models.Cliente
import models.Tecnico
import java.util.Date

class SistemaChamados {
    private val clientes = mutableListOf<Cliente>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val chamados = mutableListOf<Chamado>()

    fun cadastrarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun editarCliente(cliente: Cliente) {
        clientes.find { it.cpf == cliente.cpf }?.apply {
            nome = cliente.nome
            email = cliente.email
            telefone = cliente.telefone
            endereco = cliente.endereco
        }
    }

    fun excluirCliente(cliente: Cliente) {
        clientes.removeIf { it.cpf == cliente.cpf }
    }

    fun consultarCliente(cpf: String): Cliente? {
        return clientes.find { it.cpf == cpf }
    }

    fun cadastrarTecnico(tecnico: Tecnico) {
        tecnicos.add(tecnico)
    }

    fun editarTecnico(tecnico: Tecnico) {
        tecnicos.find { it.cpf == tecnico.cpf }?.apply {
            nome = tecnico.nome
            email = tecnico.email
            telefone = tecnico.telefone
            especialidade = tecnico.especialidade
        }
    }

    fun excluirTecnico(tecnico: Tecnico) {
        tecnicos.removeIf { it.cpf == tecnico.cpf }
    }

    fun consultarTecnico(cpf: String): Tecnico? {
        return tecnicos.find { it.cpf == cpf }
    }

    fun abrirChamado(chamado: Chamado) {
        chamados.add(chamado)
    }

    fun fecharChamado(chamado: Chamado) {
        chamado.status = "Fechado"
        chamado.dataConclusao = Date()
    }

    fun listarChamadosAbertos(): List<Chamado> {
        return chamados.filter { it.status == "Aberto" }
    }

    fun gerarRelatorioAtendimento() {
        chamados.forEach {
            println("Chamado ID: ${it.id}, Status: ${it.status}, Cliente: ${it.cliente.nome}, Técnico: ${it.tecnico?.nome ?: "Não atribuído"}")
        }
    }
}
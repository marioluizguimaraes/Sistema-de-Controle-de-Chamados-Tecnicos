package services

import models.Cliente
import models.Tecnico
import models.Chamado

class Sistema{
    private val clientes = mutableListOf<Cliente>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val chamados = mutableListOf<Chamado>()

    fun cadastrarCliente(cliente: Cliente) {
        clientes.add(cliente)
        println("Cliente ${cliente.nome} cadastrado!")
    }

    fun cadastrarTecnico(tecnico: Tecnico) {
        tecnicos.add(tecnico)
        println("Técnico ${tecnico.nome} cadastrado!")
    }

    fun abrirChamado(chamado: Chamado) {
        chamados.add(chamado)
        println("Chamado ${chamado.id} aberto para ${chamado.cliente.nome}")
    }

    fun fecharChamado(id: Int) {
        val chamado = chamados.find { it.id == id }
        chamado?.fecharChamado() ?: println("Chamado não encontrado!")
    }

    fun listarChamadosAbertos() {
        val abertos = chamados.filter { it.status == StatusChamado.ABERTO }
        println("Chamados em aberto: ${abertos.size}")
        abertos.forEach { println("ID: ${it.id}, Cliente: ${it.cliente.nome}, Prioridade: ${it.prioridade}") }
    }

}
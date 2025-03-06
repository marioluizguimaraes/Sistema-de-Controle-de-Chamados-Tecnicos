package services

import models.Chamado
import models.Cliente
import models.Tecnico

class SistemaChamados {
    private var ligado = true
    private val chamados = mutableListOf<Chamado>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val clientes = mutableListOf<Cliente>()

    fun getLigado(): Boolean = ligado
    fun desligar() { ligado = false }

    fun listarChamados() {
        if (chamados.isEmpty()) println("Nenhum chamado cadastrado.")
        else chamados.forEach { println(it) }
    }

    fun cadastrarChamado(chamado: Chamado) {
        chamados.add(chamado)
        println("Chamado cadastrado com sucesso!")
    }

    fun removerChamado(id: Int) {
        chamados.removeIf { it.id == id }
        println("Chamado removido com sucesso!")
    }

    fun editarNomeChamado(id: Int, novoNome: String) {
        chamados.find { it.id == id }?.nome = novoNome
    }

    fun editarDescricaoChamado(id: Int, novaDescricao: String) {
        chamados.find { it.id == id }?.descricao = novaDescricao
    }

    fun editarStatusChamado(id: Int, novoStatus: String) {
        chamados.find { it.id == id }?.status = novoStatus
    }

    //procurar saber esse it. e o .find

    fun editarTecnicoChamado(id: Int, idTecnico: Int) {
        chamados.find { it.id == id }?.idTecnico = idTecnico
    }

    fun listarTecnicos() {
        if (tecnicos.isEmpty()) println("Nenhum técnico cadastrado.")
        else tecnicos.forEach { println(it) }
    }

    fun cadastrarTecnico(tecnico: Tecnico) {
        tecnicos.add(tecnico)
        println("Técnico cadastrado com sucesso!")
    }

    fun removerTecnico(id: Int) {
        tecnicos.removeIf { it.id == id }
        println("Técnico removido com sucesso!")
    }

    fun editarNomeTecnico(id: Int, novoNome: String) {
        tecnicos.find { it.id == id }?.nome = novoNome
    }

    fun editarEmailTecnico(id: Int, novoEmail: String) {
        tecnicos.find { it.id == id }?.email = novoEmail
    }

    fun editarTelefoneTecnico(id: Int, novoTelefone: String) {
        tecnicos.find { it.id == id }?.telefone = novoTelefone
    }

    fun editarEspecialidadeTecnico(id: Int, novaEspecialidade: String) {
        tecnicos.find { it.id == id }?.especialidade = novaEspecialidade
    }

    fun listarClientes() {
        if (clientes.isEmpty()) println("Nenhum cliente cadastrado.")
        else clientes.forEach { println(it) }
    }

    fun cadastrarCliente(cliente: Cliente) {
        clientes.add(cliente)
        println("Cliente cadastrado com sucesso!")
    }

    fun removerCliente(id: Int) {
        clientes.removeIf { it.id == id }
        println("Cliente removido com sucesso!")
    }

    fun editarNomeCliente(id: Int, novoNome: String) {
        clientes.find { it.id == id }?.nome = novoNome
    }

    fun editarEmailCliente(id: Int, novoEmail: String) {
        clientes.find { it.id == id }?.email = novoEmail
    }

    fun editarTelefoneCliente(id: Int, novoTelefone: String) {
        clientes.find { it.id == id }?.telefone = novoTelefone
    }

    fun editarEnderecoCliente(id: Int, novoEndereco: String) {
        clientes.find { it.id == id }?.endereco = novoEndereco
    }
}

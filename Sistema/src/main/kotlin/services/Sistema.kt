package services

import models.Chamado
import models.Cliente
import models.Tecnico

class SistemaChamados {
    private var ligado = true
    private val chamados = mutableListOf<Chamado>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val clientes = mutableListOf<Cliente>()
    private var proximoIdChamado = 1
    private var proximoIdCliente = 1
    private var proximoIdTecnico = 1

    fun getLigado(): Boolean = ligado
    fun desligar() { ligado = false }

    fun listarChamados() {
        if (chamados.isEmpty()) println("Nenhum chamado cadastrado.")
        else chamados.forEach { println(it) }
    }

    fun cadastrarChamado(chamado: Chamado) {
        val cliente = clientes.find { it.id == chamado.idCliente }
        val tecnico = tecnicos.find { it.id == chamado.idTecnico }

        if (cliente == null) {
            println("Erro: ID do cliente inválido.")
            return
        }
        if (tecnico == null) {
            println("Erro: ID do técnico inválido.")
            return
        }

        chamado.id = proximoIdChamado++
        chamados.add(chamado)
        cliente.chamados.add(chamado.id)
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
        val chamado = chamados.find { it.id == id }
        if (chamado != null) {
            chamado.status = novoStatus
            if (novoStatus.equals("Concluído", ignoreCase = true)) {
                print("Digite a data de conclusão: ")
                chamado.dataConclusao = readln()
            }
        }
    }

    fun editarTecnicoChamado(id: Int, idTecnico: Int) {
        chamados.find { it.id == id }?.idTecnico = idTecnico
    }

    fun mostrarChamado(id: Int) {
        val chamado = chamados.find { it.id == id }
        if (chamado != null) println(chamado) else println("Chamado não encontrado.")
    }

    fun listarChamadosDoCliente(idCliente: Int) {
        val cliente = clientes.find { it.id == idCliente }
        if (cliente != null) {
            if (cliente.chamados.isEmpty()) println("O cliente não possui chamados.")
            else cliente.chamados.forEach { id -> mostrarChamado(id) }
        } else {
            println("Cliente não encontrado.")
        }
    }

    fun listarTecnicos() {
        if (tecnicos.isEmpty()) println("Nenhum técnico cadastrado.")
        else tecnicos.forEach { println(it) }
    }

    fun cadastrarTecnico(tecnico: Tecnico) {
        tecnico.id = proximoIdTecnico++
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
        cliente.id = proximoIdCliente++
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
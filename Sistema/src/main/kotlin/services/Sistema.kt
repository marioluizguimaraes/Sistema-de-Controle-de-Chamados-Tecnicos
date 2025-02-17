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

    fun cadastrarTecnico(tecnico: Tecnico) {
        tecnicos.add(tecnico)
    }

}
package services

import models.Chamado
import models.Cliente
import models.Tecnico

class SistemaChamados {
    private val clientes = mutableListOf<Cliente>()
    private val tecnicos = mutableListOf<Tecnico>()
    private val chamados = mutableListOf<Chamado>()
    private var ligado: Boolean = true

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
            chamadoList.append("> ${chamado.toString()}")
        }
        if (chamadoList.toString().isEmpty()){
            return "⚠ Nenhum chamado foi encontrado!"
        }
        return chamadoList.toString()
    }

    fun editarNomeChamado(id: Int, nome:String){
        for (chamado in this.chamados){
            if(chamado.getIdChamado() == id){
                chamado.setNomeChamado(nome)
                println("Nome alterado!")
                break
            }
        }
    }
    fun removerChamado(id: Int){
        var index: Int = -1
        for (chamado in this.chamados){
            index ++
            if(chamado.getIdChamado() == id){
                this.chamados.removeAt(index)
            }
        }
    }

    fun listarClientes(): String {
        val clientesList = StringBuilder()
        for (cliente in clientes) {
            clientesList.append("> ${cliente.toString()}")
        }
        if (clientesList.toString().isEmpty()){
            return "⚠ Nenhum cliente foi encontrado!"
        }
        return clientesList.toString()
    }

    fun listarTecnicos(): String {
        val tecnicosList = StringBuilder()
        for (tecnico in tecnicos) {
            tecnicosList.append("> ${tecnico.toString()}")
        }
        if (tecnicosList.toString().isEmpty()){
            return "⚠ Nenhum técnico foi encontrado!"
        }
        return tecnicosList.toString()
    }

    fun desligar(){
        this.ligado = false
    }
    fun getLigado(): Boolean{
        return this.ligado
    }

    fun listarChamadosDoCliente(id: Int): String{
        val chamadosDoCliente = StringBuilder()

        for (cliente in clientes){
            if (cliente.getIdCliente() == id){
                for (idChamado in cliente.getIdChamados()){
                    for (chamado in chamados){
                        if( idChamado == chamado.getIdChamado())
                            chamadosDoCliente.append("> ${chamado.toString()}\n")
                        break
                    }
                }
                break
            }
        }
        return chamadosDoCliente.toString()
    }

    fun encontrarCliente(id: Int):String{
        for (cliente in clientes){
            if (id == cliente.getIdCliente()) return cliente.getNomeCliente()
        }
        return "Cliente não encontrado!"
    }


}
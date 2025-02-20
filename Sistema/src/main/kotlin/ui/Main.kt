package ui

import services.SistemaChamados


fun main() {
    val sistema = SistemaChamados()

    while (sistema.getLigado()){
        print("Menu: digite um comando(ex: /help)")
        var entradaDeComando = readln()

        when(entradaDeComando){
            "/help" -> println(sistema.listarComando())
            "/cadastrar cliente" -> sistema.cadastrarCliente(Forms.cliente())
            "/cadastrar técnico" -> sistema.cadastrarTecnico(Forms.tecnico())
            "/cadastrar chamado" -> sistema.cadastrarChamado(Forms.chamado())
            "/listar clientes" -> println("Lista de clientes cadastrados: \n${sistema.listarClientes()}")
            "/listar tecnicos" -> println("Lista de técnicos cadastrados: \n${ sistema.listarTecnicos()}")  
            "/listar chamados" -> println("Lista de chamados cadastrados: \n${ sistema.listarChamados()}")
            "/sair" -> println("${sistema.desligar()}Desligando sistema...")
            else -> println("Comando inválido!")
        }
    }
}


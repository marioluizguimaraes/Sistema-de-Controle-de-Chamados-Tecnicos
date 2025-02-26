package view

import services.SistemaChamados

val sistema = SistemaChamados()

fun main() {

    while (sistema.getLigado()){
        menuPrincipal()
        var entradaDeComando = readln()
        when(entradaDeComando){
            "0" -> sistema.desligar()
            "1" -> menuChamados()

            else -> println("Comando inválido!")
        }
    }
}

fun menuPrincipal(){
    println("\n-------------------------------------------\n")
    println("Menu Principal:")
    println("[1] Acessar Chamados\n[2] Acessar Técnicos\n[3] Acessar Clientes\n[0] Sair")
    print("Comando: ")
}

fun menuChamados(){
    while (sistema.getLigado()){
        println("\n-------------------------------------------\n")
        println("Sistema>Chamados")
        println("Menu de Chamados:")
        println("[1] Listar todos os Chamados\n[2] Editar chamado\n[3] Adicionar Chamado\n[4] Remover Chamado\n[0] voltar")

        print("Comando: ")
        var entradaDeComando = readln()

        when(entradaDeComando){
            "0" -> return
            "1" -> sistema.listarChamados()
            "2" -> sistema.editarChamado()
            "3" -> sistema.cadastrarChamado(Forms.novoChamado())
            "4" -> sistema.removerChamado()
            else -> println("Comando inválido!")
        }
    }
}


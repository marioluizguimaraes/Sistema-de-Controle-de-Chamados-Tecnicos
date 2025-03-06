package view

import services.SistemaChamados

val sistema = SistemaChamados()

fun main() {
    while (sistema.getLigado()) {
        menuPrincipal()
        when (readln()) {
            "0" -> sistema.desligar()
            "1" -> menuChamados()
            "2" -> menuTecnicos()
            "3" -> menuClientes()
            else -> println("Comando inválido!")
        }
    }
}

fun menuPrincipal() {
    println("\n-------------------------------------------\n")
    println("Menu Principal:")
    println("[1] Acessar Chamados\n[2] Acessar Técnicos\n[3] Acessar Clientes\n[0] Sair")
    print("Comando: ")
}

/*------------------------------------- Chamado ------------------------------------------------------*/
fun menuChamados() {
    while (sistema.getLigado()) {
        println("\n-------------------------------------------\n")
        println("Sistema > Chamados")
        println("[1] Listar todos os Chamados\n[2] Editar chamado\n[3] Adicionar Chamado\n[4] Remover Chamado\n[0] Voltar")
        print("Comando: ")

        when (readln()) {
            "0" -> return
            "1" -> sistema.listarChamados()
            "2" -> menuEditarChamado()
            "3" -> sistema.cadastrarChamado(Forms.novoChamado())
            "4" -> sistema.removerChamado(Forms.inputId("Digite o ID: "))
            else -> println("Comando inválido!")
        }
    }
}

fun menuEditarChamado() {
    while (sistema.getLigado()) {
        println("\n-------------------------------------------\n")
        println("Sistema > Chamados > Editar")
        println("[1] Editar Nome\n[2] Editar Descrição\n[3] Editar Status\n[4] Editar Técnico\n[0] Voltar")

        val id = Forms.inputId("Digite o ID do chamado: ")

        print("Comando: ")
        when (readln()) {
            "0" -> return
            "1" -> sistema.editarNomeChamado(id, Forms.inputText("Digite o novo nome: "))
            "2" -> sistema.editarDescricaoChamado(id, Forms.inputText("Digite a nova descrição: "))
            "3" -> sistema.editarStatusChamado(id, Forms.inputText("Digite o novo status: "))
            "4" -> sistema.editarTecnicoChamado(id, Forms.inputId("Digite o ID do novo técnico: "))
            else -> println("Comando inválido!")
        }
    }
}

/*------------------------------------- Técnico ------------------------------------------------------*/
fun menuTecnicos() {
    while (sistema.getLigado()) {
        println("\n-------------------------------------------\n")
        println("Sistema > Técnicos")
        println("[1] Listar Técnicos\n[2] Adicionar Técnico\n[3] Editar Técnico\n[4] Remover Técnico\n[0] Voltar")
        print("Comando: ")

        when (readln()) {
            "0" -> return
            "1" -> sistema.listarTecnicos()
            "2" -> sistema.cadastrarTecnico(Forms.novoTecnico())
            "3" -> menuEditarTecnico()
            "4" -> sistema.removerTecnico(Forms.inputId("Digite o ID do técnico: "))
            else -> println("Comando inválido!")
        }
    }
}

fun menuEditarTecnico() {
    while (sistema.getLigado()) {
        println("\n-------------------------------------------\n")
        println("Sistema > Técnicos > Editar")
        println("[1] Editar Nome\n[2] Editar Email\n[3] Editar Telefone\n[4] Editar Especialidade\n[0] Voltar")
        print("Comando: ")

        val id = Forms.inputId("Digite o ID do técnico: ")
        when (readln()) {
            "0" -> return
            "1" -> sistema.editarNomeTecnico(id, Forms.inputText("Digite o novo nome: "))
            "2" -> sistema.editarEmailTecnico(id, Forms.inputText("Digite o novo email: "))
            "3" -> sistema.editarTelefoneTecnico(id, Forms.inputText("Digite o novo telefone: "))
            "4" -> sistema.editarEspecialidadeTecnico(id, Forms.inputText("Digite a nova especialidade: "))
            else -> println("Comando inválido!")
        }
    }
}

/*------------------------------------- Cliente ------------------------------------------------------*/
fun menuClientes() {
    while (sistema.getLigado()) {
        println("\n-------------------------------------------\n")
        println("Sistema > Clientes")
        println("[1] Listar Clientes\n[2] Adicionar Cliente\n[3] Editar Cliente\n[4] Remover Cliente\n[0] Voltar")
        print("Comando: ")

        when (readln()) {
            "0" -> return
            "1" -> sistema.listarClientes()
            "2" -> sistema.cadastrarCliente(Forms.novoCliente())
            "3" -> menuEditarCliente()
            "4" -> sistema.removerCliente(Forms.inputId("Digite o ID do cliente: "))
            else -> println("Comando inválido!")
        }
    }
}

fun menuEditarCliente() {
    while (sistema.getLigado()) {
        println("\n-------------------------------------------\n")
        println("Sistema > Clientes > Editar")
        println("[1] Editar Nome\n[2] Editar Email\n[3] Editar Telefone\n[4] Editar Endereço\n[0] Voltar")
        print("Comando: ")

        val id = Forms.inputId("Digite o ID do cliente: ")
        when (readln()) {
            "0" -> return
            "1" -> sistema.editarNomeCliente(id, Forms.inputText("Digite o novo nome: "))
            "2" -> sistema.editarEmailCliente(id, Forms.inputText("Digite o novo email: "))
            "3" -> sistema.editarTelefoneCliente(id, Forms.inputText("Digite o novo telefone: "))
            "4" -> sistema.editarEnderecoCliente(id, Forms.inputText("Digite o novo endereço: "))
            else -> println("Comando inválido!")
        }
    }
}
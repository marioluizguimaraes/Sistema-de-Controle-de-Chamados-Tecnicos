package view

import services.SistemaChamados


fun main() {
    val sistema = SistemaChamados()

    while (sistema.getLigado()){
        print("Menu: digite um comando(ex: /help)")
        var entradaDeComando = readln()

        when(entradaDeComando){


            else -> println("Comando inválido!")
        }
    }
}


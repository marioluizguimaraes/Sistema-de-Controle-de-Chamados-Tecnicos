package view

import services.SistemaChamados


fun main() {
    val sistema = SistemaChamados()

    while (sistema.getLigado()){
        Menu.principal()
        var entradaDeComando = readln()
        when(entradaDeComando){
            "0" -> sistema.desligar()
            "1" -> sistema

            else -> println("Comando inválido!")
        }
    }
}


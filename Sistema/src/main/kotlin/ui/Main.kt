package ui

import models.*
import services.SistemaChamados


fun main() {
    val sistema = SistemaChamados()

    /*
      1
      Mário Luiz
      706.649.100-70
      mario@email.com
      (84) 9999-3334
      Serrambi II, Rua Desportista Jeremias Farias Lacerda, 1630, 59091250, Apartamento 303 do Bloco 13, Natal, Rio Grande do Norte

      2
      João Silva
      345.674.723-42
      joao@email.com
      (84) 9999-3333
      Serrambi II, Rua Desportista Jeremias Farias Lacerda, 1630, 59091250, Apartamento 202 do Bloco 21, Natal, Rio Grande do Norte

    */

    //sistema.cadastrarCliente(Forms.cliente())
    //sistema.cadastrarTecnico(Forms.tecnico())
    sistema.cadastrarChamado(Forms.chamado())


    print("\n lista de clientes cadastrados: \n${sistema.listarClientes()}\n")
    print("\n lista de chamados cadastrados: \n${ sistema.listarChamados()}\n")

}


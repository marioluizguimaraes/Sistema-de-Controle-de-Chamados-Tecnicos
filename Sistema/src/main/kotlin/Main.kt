import models.*
import services.SistemaChamados


fun main() {
    val sistema = SistemaChamados()

    val cliente1 = Cliente(
        "João Silva",
        "12345678900",
        "joao@email.com",
        "11987654321",
        "Rua A, 123"
    )

    val tecnico1 = Tecnico(
        "Carlos Souza",
        "98765432100",
        "carlos@email.com",
        "11912345678",
        "Redes"
    )
    val chamado1 = Chamado(
        2,
        "Concerto Drone Mini 3",
        "drone mini 3 com eixo quebrado",
        "Andamento",
        "Urgente",
        cliente1,
        tecnico1,
        "01/02/2025"
    )

    sistema.cadastrarCliente(cliente1)
    sistema.cadastrarTecnico(tecnico1)
    sistema.cadastrarChamado(chamado1)

    //print(sistema.listarClientes())
    //print(sistema.listarTecnicos())

    print(sistema.listarChamados())
    sistema.

}

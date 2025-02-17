import models.*
import services.SistemaChamados

fun main() {
    val sistema = SistemaChamados()

    val cliente1 = Cliente("João Silva", "12345678900", "joao@email.com", "11987654321", "Rua A, 123")
    val tecnico1 = Tecnico("Carlos Souza", "98765432100", "carlos@email.com", "11912345678", "Redes")

    sistema.cadastrarCliente(cliente1)
    sistema.cadastrarTecnico(tecnico1)
}

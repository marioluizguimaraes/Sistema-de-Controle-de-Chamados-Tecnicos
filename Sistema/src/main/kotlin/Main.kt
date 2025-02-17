import models.*
import services.SistemaChamados

fun main() {
    val sistema = SistemaChamados()

    val cliente1 = Cliente("João Silva", "12345678900", "joao@email.com", "11987654321", "Rua A, 123")
    val tecnico1 = Tecnico("Carlos Souza", "98765432100", "carlos@email.com", "11912345678", "Redes")

    sistema.cadastrarCliente(cliente1)
    sistema.cadastrarTecnico(tecnico1)

    val chamado1 = Chamado(1, "Internet não funciona", "Novo", "Alta", cliente1)
    sistema.abrirChamado(chamado1)

    tecnico1.atenderChamado(chamado1)
    sistema.fecharChamado(chamado1)

    sistema.gerarRelatorioAtendimento()
}

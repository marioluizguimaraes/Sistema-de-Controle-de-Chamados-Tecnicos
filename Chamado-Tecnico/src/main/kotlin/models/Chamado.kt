package models

import java.util.*

class Chamado(
    val id: Int,
    var descricao: String,
    var status: String = "Novo",
    var prioridade: String,
    val cliente: Cliente,
    var tecnico: Tecnico,
    val dataAbertura: Date,
    val dataConclusao: Date
)
package models

import java.util.*

class Chamado(
    var id: Int,
    var descricao: String,
    var status: String = "Novo",
    var prioridade: String,
    var cliente: Cliente,
    var tecnico: Tecnico? = null,
    var dataAbertura: Date? = null,
    var dataConclusao: Date? = null
)

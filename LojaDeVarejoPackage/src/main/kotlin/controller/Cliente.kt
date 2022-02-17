package controller

class Cliente {
    fun clienteFactory(
        nome:String,
        idade: Byte,
        educacao: String,
        credito: String,
        endereco:String,

    ) = model.Cliente(
        nome = nome,
        idade = idade,
        educacao = educacao,
        credito = credito,
        endereco = endereco
    )
}
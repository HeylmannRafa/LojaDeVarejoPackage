package model

class Cliente{
    var nome: String
    var idade: Byte
    var educacao: String
    var credito: String
    var endereco: String

    constructor(
        nome: String, idade: Byte, educacao: String, credito: String, endereco: String
    ) {
        this.nome = nome
        this.idade = idade
        this.educacao = educacao
        this.credito = credito
        this.endereco = endereco
    }

    override fun toString(): String {
        return "Nome ${this.nome} , Idade ${this.idade},Credito ${this.credito}"
    }
}


package model

class Vendedor {
        var nome: String
        var idade: Byte
        var documentos: String
        var endereco: String
        var experiencia: String
        var educacao: String
        var antecedentes: String

    constructor(
        nome: String, idade: Byte, documentos: String, endereco: String, experiencia: String, educacao: String,
        antecedentes: String
    ) {
        this.nome = nome
        this.idade = idade
        this.documentos = documentos
        this.endereco = endereco
        this.experiencia = experiencia
        this.educacao = educacao
        this.antecedentes = antecedentes
    }

    override fun toString(): String {
        return "Nome: ${this.nome},Antecedentes${this.antecedentes},Experiencia ${this.experiencia}"



    }
}
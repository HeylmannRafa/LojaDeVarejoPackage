package model

class Transportadora {
    var nome:String
    var sustentabilidade: String
    var rastreio: String
    var seguranca: String
    var protecaoPerdas: String

    constructor(nome:String,sustentabilidade: String, rastreio: String, seguranca: String, protecaoPerdas: String) {

        this.nome = nome
        this.sustentabilidade = sustentabilidade
        this.rastreio = rastreio
        this.seguranca = seguranca
        this.protecaoPerdas = protecaoPerdas
    }

    override fun toString(): String {
        return "Sustentabilidade ${this.sustentabilidade}, Segurança ${this.seguranca}"
    }
}
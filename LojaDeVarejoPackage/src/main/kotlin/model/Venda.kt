package model

class Venda {

    var plataforma: String
    var estoqueLoja: String
    var divulgacaoP: String

    constructor(plataforma: String, estoqueLoja: String, divulgacaoP: String) {

        this.plataforma = plataforma
        this.estoqueLoja = estoqueLoja
        this.divulgacaoP = divulgacaoP

    }

    override fun toString(): String {
        return "Plataformas ${this.plataforma},Divulgação ${this.divulgacaoP}"
    }

}
package model

class Produto {

    var produtoA:String
    var qualidade: String
    var marca: String
    var beneficio: String
    var preco: String
    var procedencia: String

    constructor(produtoA:String,qualidade: String, marca: String, beneficio: String, preco: String , procedencia:String) {

        this.produtoA = produtoA
        this.qualidade = qualidade
        this.marca = marca
        this.beneficio = beneficio
        this.preco = preco
        this.procedencia = procedencia
    }

    override fun toString(): String {
        return "Beneficio ${this.beneficio}, Qualidade ${this.qualidade}"
    }
}
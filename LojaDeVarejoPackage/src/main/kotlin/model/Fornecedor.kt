package model

class Fornecedor {
    var empresa: String
    var localizacao: String
    var referencia: String
    var capacidadeDeFornecimento: String
    var prazo: String
    var frete: Short
    var pagamento: String

    constructor(
        empresa: String, localizacao: String, referencia: String, capacidadeDeFornecimento: String, prazo: String
        frete: Short, pagamento: String
    ) {
        this.empresa = empresa
        this.localizacao = localizacao
        this.referencia = referencia
        this.capacidadeDeFornecimento = capacidadeDeFornecimento
        this.prazo = prazo
        this.frete = frete
        this.pagamento = pagamento

    }

    override fun toString(): String {
        return "Empresa ${this.empresa}, Localização ${this.localizacao}, Referencia ${this.referencia}"
    }

}

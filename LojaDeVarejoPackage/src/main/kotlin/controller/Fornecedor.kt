package controller

class Fornecedor {
    fun fornecedorFactory(
        empresa: String,
        localizacao: String,
        referencia: String,
        capacidadeDeFornecimento: String,
        prazo: String,
        frete: Short,
        pagamento: String,
    ) = model.Fornecedor(
        empresa = empresa,
        localizacao = localizacao,
        referencia = referencia,
        capacidadeDeFornecimento = capacidadeDeFornecimento,
        prazo = prazo,
        frete = frete,
        pagamento = pagamento

    )
}
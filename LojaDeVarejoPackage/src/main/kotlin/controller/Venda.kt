package controller

class Venda {
    fun vendaFactory(
        plataforma: String,
        estoqueLoja: String,
        divulgacaoP: String

    ) = model.Venda(
        plataforma = plataforma,
        estoqueLoja = estoqueLoja,
        divulgacaoP = divulgacaoP

    )
}
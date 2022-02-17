package controller

class Produto {
    fun produtoFactory(
        produtoA:String,
        qualidade: String,
        marca: String,
        beneficio: String,
        preco: String,
        procedencia: String,
        ) = model.Produto(
        produtoA = produtoA,
        qualidade = qualidade,
        marca = marca,
        beneficio = beneficio ,
        preco = preco,
        procedencia = procedencia

        )

}
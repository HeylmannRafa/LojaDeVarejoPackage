package controller

class Vendedor {
    fun vendedorFactory(

        nome: String,
        idade: Byte,
        documentos: String,
        endereco: String,
        experiencia: String,
        educacao: String,
        antecedentes: String,
    ) = model.Vendedor (
        nome = nome,
        idade = idade,
        documentos = documentos,
        endereco = endereco,
        experiencia = experiencia,
        educacao = educacao,
        antecedentes = antecedentes
            )
}
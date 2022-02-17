package controller

class Transportadora {
    fun transportadoraFactory(

        nome:String,
        sustentabilidade:String,
        rastreio : String,
        seguranca : String,
        protecaoPerdas: String
    ) = model.Transportadora(
        nome= nome ,
        sustentabilidade = sustentabilidade,
        rastreio = rastreio,
        seguranca = seguranca,
        protecaoPerdas = protecaoPerdas
    )
}
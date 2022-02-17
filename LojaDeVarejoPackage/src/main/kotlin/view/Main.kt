package view

fun main (args: Array<String>){

 val clienteController = controller.Cliente()
 val cliente = clienteController.clienteFactory(
     nome = "Maia Silva" ,
     idade = 26,
     educacao =  "Superior",
     credito = "30000",
     endereco = "Rua B n°56 , Porto-Alegre"
 )
println(cliente.nome)

    val fornecedorController = controller.Fornecedor()
    val fornecedor = fornecedorController.fornecedorFactory(
        empresa = "HM Fornecimentos",
        localizacao = "Rua G n°500 , Porto Alegre/RS",
        referencia = "Principal fornecedor de Zafari",
        capacidadeDeFornecimento = "5 toneladas",
        prazo = "2 meses",
        frete = 5000,
        pagamento = "Dinheiro,cartão"
    )
    println(fornecedor.empresa)

    val produtoController = controller.Produto()
    val produto = produtoController.produtoFactory(
        produtoA = "Geladeira",
        qualidade = "Bom desempenho",
        marca = "GV",
        beneficio = "Bom preço e otima refrigeração",
        preco = "R$1200,00",
        procedencia = "EUA"

    )
    println(produto.produtoA)

    val transportadoraController = controller.Transportadora()
    val transportadora = transportadoraController.transportadoraFactory(
        nome = "MV Transportadoras",
        sustentabilidade = "Investimentos e Parcerias",
        rastreio = "Rastreio online e seguro",
        seguranca = "Software completo para gestão de frota,frete,financeiro,armazém e emissão de documentos",
        protecaoPerdas = "Garantimos o pagamento de indenização em caso de perda ou danos durante o transporte ",



    )
    println(transportadora.seguranca)


    val vendaController = controller.Venda()
    val venda = vendaController.vendaFactory(
        plataforma = "Wish",
        estoqueLoja = "300 produtos ",
        divulgacaoP = "www.produtotal.com.br"

    )
    println(venda.plataforma)

    val vendedrController = controller.Vendedor()
    val vendedor = vendedorController.vendedorFactory(
        nome = "Maria Silva " ,
        idade = 26,
        documentos = "666666666666" ,
        endereco = "Rua K n°90 Porto Alegre/RS",
        experiencia = "6 anos de experiencia" ,
        educacao ="Ensino Técnico",
        antecedentes = "Sem antescedentes criminais ",
    )
    println(vendedor.experiencia)
    


 }


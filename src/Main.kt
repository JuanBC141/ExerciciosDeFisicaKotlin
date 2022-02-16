fun main(){
    val forcaPeso: ForcaPeso = ForcaPeso()
    val forcaCentrípeta: ForcaCentrípeta = ForcaCentrípeta()
    val impulso: Impulso = Impulso()
    val forcaElastica: ForcaElastica = ForcaElastica()
    val velocidadeMedia: VelocidadeMedia = VelocidadeMedia()
    val movimentoRetilineoUniformemente: MovimentoRetilineoUniformemente = MovimentoRetilineoUniformemente()
    val movimentoRetilineoUniformementeVariado: MovimentoRetilineoUniformementeVariado = MovimentoRetilineoUniformementeVariado()

    val resultadoForcaPeso: Float = forcaPeso.calcularForcaPeso(10f, 9.8f)
    println("O Resultado da multiplicação é $resultadoForcaPeso")


    val resultadoForcaCentrípeta: Float = forcaCentrípeta.calcularForcaCentripeta(800f, 20f,100f)
    println("O Resultado da Força Centrípeta é $resultadoForcaCentrípeta")

    val resultadoImpulso: Float = impulso.calcularImpulso(100f,20f)
    println("O Resultado do Impulso é $resultadoImpulso")

    val resultadoForcaElastica: Float = forcaElastica.calcularForcaElastica(100f, 150f)
    println("O Resultado da Forca Elastica é $resultadoForcaElastica")

    val resultadoVelocidadeMedia: Float = velocidadeMedia.calcularVelocidadeMedia(300f,0f,12f, 7f)
    println("O Resultado da Velocidade Média é $resultadoVelocidadeMedia")

    val resultadoMovimentoRetilineoUniformemente: Float = movimentoRetilineoUniformemente.calcularMovimentoRetilineoUniformemente(2f,2.5f,340f)
    println("Movimento Retilíneo Uniformemente = $resultadoMovimentoRetilineoUniformemente")

    val resultadoMovimentoRetilineoUniformementeVariado: Float = movimentoRetilineoUniformementeVariado.calcularMovimentoRetilineoUniformementeVariado(0f,0f,5f,13f)
    println("O Rsultado do Movimento Retilineo Uniformemente Variado é $resultadoMovimentoRetilineoUniformementeVariado")
}

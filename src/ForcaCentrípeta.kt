import kotlin.math.pow
class ForcaCentrípeta {

    fun VelocidadeDaForcaCentripeta(base:Float, expoente:Float) : Float{
        return base.pow(expoente).toFloat()
    }

    fun calcularForcaCentripeta(massa:Float, velocidade:Float, raio: Float) :Float{
        return  massa *(VelocidadeDaForcaCentripeta(base = velocidade, expoente = 2f) / raio)
    }

}
package domain.interfaces

interface Moveable {
    val maxSpeed: Float
    val weight: Double

    var currentSpeed: Float

    fun increaseSpeed(ds: Float)

    fun reduceSpeed(ds: Float)


}
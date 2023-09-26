package domain.model

import domain.interfaces.Moveable

sealed class Passenger(
    override val maxSpeed: Float,
    override val weight: Double
): Moveable {
    override var currentSpeed: Float = 0f

    override fun increaseSpeed(ds: Float) {
        currentSpeed += ds
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed
        }
    }

    override fun reduceSpeed(ds: Float) {
        currentSpeed -= ds
        if (currentSpeed < 0) {
            currentSpeed = 0f
        }
    }

    class Child: Passenger(
        maxSpeed = 8f,
        weight = 45.0,
    )

    class Adult: Passenger(
        maxSpeed = 23f,
        weight = 75.0
    )



}
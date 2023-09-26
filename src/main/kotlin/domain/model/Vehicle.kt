package domain.model

import domain.interfaces.Moveable

open class Vehicle<T>(
    override val maxSpeed: Float,
    override val weight: Double,
    var passengers: List<T> = emptyList(),
    val enginePower: Int,
    val label: String
) : Moveable {
    override var currentSpeed: Float = 0f

    override fun toString(): String = "Vehicle \"$label\".\n" +
            " - max speed is $maxSpeed, " +
            "weight is $weight, boarded " +
            "weight is ${getBoardedWeight()}"

    fun getBoardedWeight(): Double =
        when (passengers.firstOrNull()) {
            is Moveable -> weight + passengers
                .sumOf { (it as Moveable).weight }
            is Int -> weight + passengers
                .sumOf { it as (Int) }
            else -> weight
        }

    fun boardPassengers(value: List<T>) {
        passengers = value
    }

    fun dropOffPassengers() {
        passengers = emptyList()
    }

    override fun increaseSpeed(ds: Float) {
        currentSpeed += powerFactor().toFloat() * ds
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed
        }
    }

    override fun reduceSpeed(ds: Float) {
        currentSpeed -= ds
    }

    private fun powerFactor(): Double {
        return if (enginePower >= 10) {
            (enginePower.toString().substring(0, 2).toFloat() / 10f) * weight / getBoardedWeight()
        } else
            enginePower / 2 * weight / getBoardedWeight()
    }

}
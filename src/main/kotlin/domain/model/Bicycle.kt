package domain.model

sealed class Bicycle(
    enginePower: Int,
    maxSpeed: Float,
    weight: Double,
    label: String,
    passengers: List<Passenger>,
    val maxPassengers: Int
) : Vehicle<Passenger>(
    enginePower = enginePower,
    maxSpeed = maxSpeed,
    weight = weight,
    label = label,
    passengers = passengers
) {

    override fun increaseSpeed(ds: Float) {
        super.increaseSpeed(ds * overloadFactor())
    }

    private fun overloadFactor(): Float =
        if (passengers.size > maxPassengers) {
            maxPassengers.toFloat() / (passengers.size * 500)
        } else {
            1f
        }

    class Single(
        passengers: List<Passenger>
    ): Bicycle(
        maxPassengers = 1,
        enginePower = 1,
        maxSpeed = 30f,
        weight = 34.0,
        label = "Single Bicycle",
        passengers = passengers
    )

    class Dual(
        passengers: List<Passenger>
    ): Bicycle(
        maxPassengers = 2,
        enginePower = 2,
        maxSpeed = 40f,
        weight = 70.0,
        label = "Dual Bicycle",
        passengers = passengers
    )

}
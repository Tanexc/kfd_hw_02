package domain.model

sealed class Ship(
    maxSpeed: Float,
    weight: Double,
    passengers: List<Passenger>,
    enginePower: Int,
    label: String,
    val waterline: Float
) : Vehicle<Passenger>(
    maxSpeed,
    weight,
    passengers,
    enginePower,
    label
) {
    override var currentSpeed: Float = 0f

    fun getWaterlineLoad() = waterline - weight / getBoardedWeight()

    class Small(
        passengers: List<Passenger>
    ): Ship(
        maxSpeed = 140f,
        weight = 2000.0,
        passengers = passengers,
        enginePower = 700,
        label = "Small ship",
        waterline = 1.5f
    )

    class Medium(
        passengers: List<Passenger>
    ): Ship(
        maxSpeed = 140f,
        weight = 6000.0,
        passengers = passengers,
        enginePower = 1400,
        label = "Medium ship",
        waterline = 4.3f
    )

    class Big(
        passengers: List<Passenger>
    ): Ship(
        maxSpeed = 95f,
        weight = 13200.0,
        passengers = passengers,
        enginePower = 3175,
        label = "Big ship",
        waterline = 5.5f
    )
}
package domain.model

sealed class Bus(
    maxSpeed: Float,
    weight: Double,
    passengers: List<Passenger>,
    enginePower: Int,
    label: String,
    val wheelCount: Int
) : Vehicle<Passenger>(
    maxSpeed,
    weight,
    passengers,
    enginePower,
    label
) {
    override var currentSpeed: Float = 0f

    class Small(
        passengers: List<Passenger>
    ): Bus(
        maxSpeed = 70f,
        weight = 2000.0,
        passengers = passengers,
        enginePower = 450,
        label = "Small bus",
        wheelCount = 4
    )

    class Medium(
        passengers: List<Passenger>
    ): Bus(
        maxSpeed = 140f,
        weight = 3500.0,
        passengers = passengers,
        enginePower = 1000,
        label = "Medium bus",
        wheelCount = 6
    )

    class Big(
        passengers: List<Passenger>
    ): Bus(
        maxSpeed = 160f,
        weight = 4300.0,
        passengers = passengers,
        enginePower = 2000,
        label = "Big bus",
        wheelCount = 10
    )
}
package presentation

import domain.model.Bus
import domain.model.Passenger
import domain.model.Ship
import domain.model.VehicleTransporterBus

fun busDemo() {
    val passengers = listOf(
        Passenger.Adult(),
        Passenger.Child(),
        Passenger.Adult(),
        Passenger.Child(),
        Passenger.Adult(),
        Passenger.Child(),
        Passenger.Adult(),
        Passenger.Child()
    )

    val mediumBus = Bus.Medium(passengers)
    println(mediumBus)

    val smallBus = Bus.Small(passengers)
    println(smallBus)

    val someShip = Ship.Big(emptyList())

    val vehicleTransporter = VehicleTransporterBus(
        label = "Transporter",
        maxSpeed = 40f,
        weight = 15000.0,
        enginePower = 15000,
        passengers = listOf(
            mediumBus,
            smallBus,
            someShip
        )
    )
    println(vehicleTransporter)

    vehicleTransporter.increaseSpeed(20f)
    println("result of increasing speed by 20: ${vehicleTransporter.currentSpeed}")


}
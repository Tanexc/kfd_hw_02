package presentation

import domain.model.Passenger
import domain.model.Ship

fun shipDemo() {
    val passengers = listOf(
        Passenger.Adult(),
        Passenger.Child(),
        Passenger.Adult(),
        Passenger.Child()
    )
    val bigShip = Ship.Big(
        passengers
    )
    println(bigShip)
    println("waterline before drop off is ${bigShip.getWaterlineLoad()}")
    bigShip.dropOffPassengers()
    println("waterline after drop off is ${bigShip.getWaterlineLoad()}")
    println("\n\n")
}
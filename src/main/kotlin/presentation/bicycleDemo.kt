package presentation

import domain.model.Bicycle
import domain.model.Passenger

fun bicycleDemo() {
    val bicycle = Bicycle.Single(
        passengers = listOf(Passenger.Adult())
    )
    println(bicycle)

    val bicycleOverloaded = Bicycle.Dual(
        passengers = listOf(
            Passenger.Adult(),
            Passenger.Adult(),
            Passenger.Adult()
        )
    )
    println(bicycleOverloaded)

    bicycleOverloaded.increaseSpeed(35f)
    println("result of increasing speed of overloaded dual bicycle by 35: ${bicycleOverloaded.currentSpeed} ")
}
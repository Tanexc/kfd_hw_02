package domain.model

import domain.interfaces.Moveable

class VehicleTransporterBus<T>(
    label: String,
    maxSpeed: Float,
    weight: Double,
    enginePower: Int,
    passengers: List<Vehicle<T>> = emptyList()
): Vehicle<Vehicle<T>>(
    label=label,
    maxSpeed=maxSpeed,
    weight=weight,
    enginePower = enginePower,
    passengers = passengers
) {

    fun reloadVehicles(): List<Vehicle<T>> {
        passengers = passengers.reversed()
        return passengers
    }

    fun launchAllWithStartSpeed(speed: Float) {
        passengers.onEach {
            it.currentSpeed = speed
        }
    }

}
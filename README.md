# Описание
- В решении содержится интерфейс <a href="">Moveable</a>, сожержащий в себе переменные массы и максимальной скорости
- Класс <a href="">Vehicle</a> реализует интерфейс Moveable и расширяет его некоторыми свойставми присущими траспорным средствам
- sealed класс <a href="">Passenger</a> реализует интерфейс Moveable. От него наследуются классы Adult и Child
- sealed классы Bus, Ship, VehicleTransporterBus, Bicycle наследуются от Vehicle с реализацией некоторых особенностей отдельного транспорта
# Проверка решения
Для демонстарии можно использовать функции: shipDemo(), busDemo(), bicycleDemo()
```kotlin
fun main(args: Array<String>) {
    shipDemo()
    busDemo()
    bicycleDemo()
}
```
```kotlin
val vehicle = Vehicle<Passenger>(
        maxSpeed = 120f,
        weight = 1205.0,
        passengers = listOf(
            Passenger.Adult(),
            Passenger.Adult(),
            Passenger.Child()
        ),
        enginePower = 1230,
        label = "My vehicle"
    )
    println(vehicle) // Vehicle "My vehicle" - max speed is 120.0, weight is 1205.0, boarded weight is 1400.0

    println(vehicle.getBoardedWeight()) // 1400.0
    vehicle.increaseSpeed(12f)
    println(vehicle.currentSpeed) // 12.394286
    vehicle.dropOffPassengers() // passengers = emptyList()
    println(vehicle.getBoardedWeight()) // 1205.0
    vehicle.reduceSpeed(5f)
    println(vehicle.currentSpeed) // 7.394286
```

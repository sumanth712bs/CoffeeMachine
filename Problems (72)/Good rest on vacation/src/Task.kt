import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var numberOfDays = scanner.nextInt()
    var foodCost = scanner.nextInt()
    var flightCost = scanner.nextInt()
    var oneNightHotelCost = scanner.nextInt()

    flightCost *= 2
    foodCost *= numberOfDays
    oneNightHotelCost *= numberOfDays - 1
    var total = flightCost + foodCost + oneNightHotelCost

    println(total)
}
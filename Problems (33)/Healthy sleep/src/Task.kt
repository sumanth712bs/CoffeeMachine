import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val minHrs = scanner.nextInt()
    val maxHrs = scanner.nextInt()
    val currentHrs = scanner.nextInt()

    if (currentHrs > minHrs && currentHrs < maxHrs ) {
        println("Normal")
    } else if (currentHrs > minHrs && currentHrs > maxHrs) {
        println("Excess")
    } else if (currentHrs < minHrs && currentHrs < maxHrs) {
        println("Deficiency")
    }
}
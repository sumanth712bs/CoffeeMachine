import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val type = scanner.nextLine()
    when (type) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val perimeter = (a + b + c) / 2
            println(Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c)))
        }
        "rectangle" -> {
            val length = scanner.nextDouble()
            val breadth = scanner.nextDouble()
            println(length * breadth)
        }
        "circle" -> {
            val radius = scanner.nextDouble()
            println(3.14 * radius * radius)
        }
        else -> ""
    }
}
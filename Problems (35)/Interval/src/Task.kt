import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLong()

    if (input in -14..12 || input in 15..16 || input >= 19) {
        println("True")
    } else {
        println("False")
    }
}
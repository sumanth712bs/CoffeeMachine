import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first().isDigit().toString()
    val second = scanner.next().first().isDigit().toString()
    val third = scanner.next().first().isDigit().toString()
    val fourth = scanner.next().first().isDigit().toString()
    println(first + "\\" + second + "\\" + third + "\\" + fourth)
}
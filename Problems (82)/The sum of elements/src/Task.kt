import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum: Int = 0
    do {
        val input = scanner.nextInt()
        sum += input

    } while (input != 0)
    println(sum)
}
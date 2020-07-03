import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    println(when {
        input < 0 -> "negative"
        input == 0 -> "zero"
        else -> "positive"
    })
}
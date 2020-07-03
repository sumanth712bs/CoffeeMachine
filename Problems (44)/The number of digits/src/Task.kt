import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println( when( scanner.next().length) {
        in 0..9 -> "1"
        in 10..99 -> "2"
        in 100..999 -> "3"
        in 1000..9999 -> "4"
        else -> ""
    })
}
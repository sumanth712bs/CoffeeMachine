import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var maxNum = 0
    do {
        val n = scanner.nextInt()
        maxNum = max(maxNum, n)
    } while (n > 0)
    println(maxNum)
}
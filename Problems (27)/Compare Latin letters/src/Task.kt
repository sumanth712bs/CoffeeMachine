import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first()
    val last = scanner.next().last()
    val equals = first.equals(last, true)
    print(equals)
}
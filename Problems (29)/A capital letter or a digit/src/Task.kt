import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first()
    println(first.isUpperCase() || first in '1'..'9')
}
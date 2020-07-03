import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val number = scanner.nextInt()
    println("Symbol # $number of the string \"$input\" is '${input[number-1]}'")
}
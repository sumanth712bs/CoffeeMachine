import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val thirdNumber = scanner.nextInt()

    println(firstNumber in secondNumber..thirdNumber)
}
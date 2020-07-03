import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val thirdNumber = scanner.nextInt()
    val fourthNumber = scanner.nextInt()
    val fifthNumber = scanner.nextInt()

    if (fifthNumber in firstNumber..secondNumber && fifthNumber in thirdNumber..fourthNumber) {
        println(true)
    } else {
        println(false)
    }
}
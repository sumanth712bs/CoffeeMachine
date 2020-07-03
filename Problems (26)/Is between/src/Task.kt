import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstNum = scanner.nextInt()
    val secondNum = scanner.nextInt()
    val thirdNum = scanner.nextInt()
    println(firstNum in secondNum..thirdNum || firstNum in thirdNum..secondNum)
}
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstVar = scanner.nextInt()
    val secondVar = scanner.nextInt()
    val thirdVar = scanner.nextInt()

    println(firstVar + secondVar == 20 || firstVar + thirdVar == 20 || secondVar + thirdVar == 20)
}
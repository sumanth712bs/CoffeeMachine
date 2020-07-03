import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    IntArray(3) {scanner.nextInt()}.map { x -> println(x) }
   /* val firstVariable = scanner.nextInt()
    val secondVariable = scanner.nextInt()
    val thirdVariable = scanner.nextInt()

    println(firstVariable != secondVariable && secondVariable != thirdVariable && firstVariable != thirdVariable)*/
}
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstName = scanner.next()
    val lastName = scanner.next()
    val age = scanner.next()
    println("${firstName.first()}. $lastName, $age years old")
}
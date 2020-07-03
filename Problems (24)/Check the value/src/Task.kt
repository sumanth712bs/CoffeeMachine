import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputVal = scanner.nextInt()
    if (inputVal < 10 ) {
        println(true)
    } else {
        println(false)
    }
}
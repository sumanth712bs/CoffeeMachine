import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputVal = scanner.nextInt()
    if (inputVal % 2 == 0) {
        print(inputVal + 2)
    } else {
        print(inputVal + 1)
    }
}
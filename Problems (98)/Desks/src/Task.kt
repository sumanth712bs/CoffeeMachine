// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var deskCount = 0

    repeat(3) {
        val input = scanner.nextInt()
        if (input % 2 == 0) {
            deskCount += input / 2
        } else {
            deskCount += (input / 2) + 1
        }
    }
    println(deskCount)
}
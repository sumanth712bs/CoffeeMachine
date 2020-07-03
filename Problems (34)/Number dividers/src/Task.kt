import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    for (i in 2..input) {
        if (input % i == 0 && (i == 2 || i == 3 || i == 5 || i == 6)) {
            println("Divided by $i")
        }
    }
}
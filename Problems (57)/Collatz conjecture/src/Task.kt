import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()
    var str = "$input "
    while (input > 1) {
        if (input % 2 == 0) {
            input /= 2
            str += "$input "
        } else {
            input = (input * 3) + 1
            str += "$input "
        }
    }

    println(str)
}
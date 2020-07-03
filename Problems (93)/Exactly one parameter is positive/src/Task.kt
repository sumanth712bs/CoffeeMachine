// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var count: Int = 0

    repeat(3) {
        if (scanner.nextInt() > 0) count++
    }
    print(count == 1)
}
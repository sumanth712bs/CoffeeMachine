// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputVal = scanner.nextInt()
    var count: Int = 1
    var elementCount: Int = 1

    while (elementCount <= inputVal) {
        var numberCount: Int = 1
        while (numberCount <= count && elementCount <= inputVal) {
            print("$count ")
            numberCount++
            elementCount++

        }
        count++
    }
}
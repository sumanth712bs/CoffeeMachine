import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputVal = scanner.nextInt()
    var highestNum = 0
    repeat(inputVal) {
        val input = scanner.nextInt()
        if (input % 4 == 0) highestNum = maxOf(input, highestNum)
    }

    println(highestNum)
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputVal = scanner.nextInt()
    var counter = 1
    var squares = 1

    while (squares <= inputVal) {

        squares = Math.pow(counter.toDouble(), 2.0).toInt()
        counter++
        if (squares <= inputVal) println(squares)
    }
}
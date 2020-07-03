import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numberOfInputs = scanner.nextInt()
    var counter = 0;
    repeat(numberOfInputs) {
        val input = scanner.nextInt()
        if (input > 0) {
            counter ++
        }
    }
    println(counter)
}
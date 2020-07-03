import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    while (scanner.hasNext()) {
        list.add(scanner.nextInt())
    }
    list.max().run { println("$this ${list.indexOf(this) + 1}") }
}
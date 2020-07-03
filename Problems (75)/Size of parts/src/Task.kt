import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var perfectCount = 0
    var fixedCount = 0
    var rejectCount = 0
    val partsCount = scanner.nextInt()
    repeat(partsCount) {
        when (scanner.nextInt()) {
            0 -> perfectCount++
            1 -> fixedCount++
            -1 -> rejectCount++
        }
    }
    println("$perfectCount $fixedCount $rejectCount")
}
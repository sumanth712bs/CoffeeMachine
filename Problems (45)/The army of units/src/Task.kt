import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputVal = scanner.nextInt()
    println( when {
        inputVal < 1 -> "no army"
        inputVal in 1..4 -> "few"
        inputVal in 5..9 -> "several"
        inputVal in 10..19 -> "pack"
        inputVal in 20..49 -> "lots"
        inputVal in 50..99 -> "horde"
        inputVal in 100..249 -> "throng"
        inputVal in 250..499 -> "swarm"
        inputVal in 500..999 -> "zounds"
        else -> "legion"
    })
}
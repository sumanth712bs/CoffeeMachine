import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val studentsCount = scanner.nextInt()
    var dCount = 0
    var cCount = 0
    var bCount = 0
    var aCount = 0

    repeat(studentsCount) {
        val score = scanner.nextInt()
        when (score) {
            in 0..2 -> dCount++
            3 -> cCount++
            4 -> bCount++
            5 -> aCount++
        }
    }
    println("$dCount $cCount $bCount $aCount")
}
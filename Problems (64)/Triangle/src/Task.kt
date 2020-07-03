import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstSide = scanner.nextInt()
    val secondSide = scanner.nextInt()
    val thirdSide = scanner.nextInt()

    if (firstSide+secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide) {
        println("YES")
    } else {
        println("NO")
    }
}
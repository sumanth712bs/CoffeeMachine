import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    var a = 0
    var b = 0
    var c = 0
    var d = 0

    if (x1 <= x2) {
        if (y1 <= y2) {
            a = x1 + 2
            b = y1 + 1
            c = x1 + 1
            d = y1 + 2
        } else {
            a = x1 + 2
            b = y1 - 1
            c = x1 + 1
            d = y1 - 2
        }
    } else if (y1 <= y2) {
        a = x1 - 2
        b = y1 + 1
        c = x1 - 1
        d = y1 + 2
    } else {
        a = x1 - 2
        b = y1 - 1
        c = x1 - 1
        d = y1 - 2
    }

    if ((x2 == a && y2 == b) || (x2 == c && y2 == d)) {
        println("YES")
    } else {
        println("NO")
    }
}
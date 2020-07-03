import java.util.Scanner
/*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstChar = scanner.next().single()
    val secondChar = scanner.next().single()
    val thirdChar = scanner.next().single()

    if (firstChar + 1 == secondChar && firstChar + 2 == thirdChar) {
        println(true)
    } else {
        println(false)
    }
}*/


fun main() {
    val movieOne = Movie("Anna Gotter")
    movieOne.length = -24
    val movieTwo = Movie("Sky Wars")
    movieTwo.length = 15
    print(movieTwo.length - movieOne.length)
}

class Movie(val name: String) {
    var length: Int = 0
        set(value) {
            field = if (value < 0) value else -value
        }
}
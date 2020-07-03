fun main() {
    val input = readLine()!!

    when {
        input.isEmpty() -> { }
        input.first() == 'i' -> {
            println(input.drop(1).toInt().plus(1))
        }
        input.first() == 's' -> {
            println(input.drop(1).reversed())
        }
        else -> println(input)
    }
}
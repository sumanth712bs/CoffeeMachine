import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    //val input = scanner.nextLine()

    /*println(when (input[1]) {
        "+" -> input[0].toLong() + input[2].toLong()
        "-" -> {
            input[0].toLong() - input[2].toLong()
        }
        "/" -> {
            if (input[2].toLong() != 0L) {
                input[0].toLong() / input[2].toLong()
            } else {
                "Division by 0!"
            }
        }
        "*" -> input[0].toLong() * input[2].toLong()
        else -> "Unknown operator"
    })*/
    var input = ""
    while (input != "exit") {
        println("Write action (buy, fill, take, remaining, exit): >")
        while (scanner.hasNext()) {
//            println("Inside while")
             input = scanner.next()
            when (input) {
                "buy" -> println("buyAction")
                "fill" -> println("fillAction")
                "take" -> println("takeAction")
//                else -> println("Invalid option")
            }
//            println("Outside when")
            break
        }
//        println("Last line")
    }


}
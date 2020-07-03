import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
   /* val numberOfPeople = scanner.nextDouble().toInt().toDouble()
    println(Math.cbrt(numberOfPeople).toInt())*/
    val b: Byte = 2 + 3            //1
    val s: Short = 2 + b           //2
    val n: Int = s.toByte() + 2    //3
    val l: Long = n + 4            //4
    val f: Float = l.toFloat() + 1 //5
    val d: Double = f / 1          //6


}
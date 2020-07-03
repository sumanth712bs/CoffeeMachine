enum class Rainbow(val colorName: String) {

    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet"),
    NULL("");

    companion object {

        fun findByName(name: String): Rainbow {
            for (color in values()) {
                if (name == color.colorName) return color
            }
            return NULL
        }
    }
}

fun main() {
    val color = Rainbow.findByName("Black")
    println(color.ordinal)
}
// Posted from EduTools plugin
import kotlin.random.Random

data class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        fun create(name: String): Player {
            return Player(Random.nextInt(), name, 100)
        }
    }
}
class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate() {
        speed += 5
    }

    fun decelerate() {
        when {
            speed in 0..5 -> speed = 0
            speed > 5 -> speed -= 5
        }
    }
}
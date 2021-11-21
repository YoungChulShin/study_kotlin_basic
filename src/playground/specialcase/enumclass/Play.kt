package playground.specialcase.enumclass

enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val state = State.RUNNING
    val message = when(state) {
        State.IDLE -> "It's idel"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)
    println(red.rgb)
    println(red.containRed())
    println(Color.BLUE.containRed())
    println(Color.YELLOW.containRed())
}
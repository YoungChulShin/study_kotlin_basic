package playground.controlflow.condtionalflow

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun ifTest(a: Int, b: Int) = if (a > b) a else b

fun main() {
    val a = 1
    val b = 2

    if (a > b) println(a) else println(b)

    if (a > b) a else b
}
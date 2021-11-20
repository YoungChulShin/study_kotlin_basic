package playground.intro.functions.OperatorFunctions

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye")

    // Operator Overloading
    // https://kotlinlang.org/docs/operator-overloading.html
    // Operator를 오버로딩해서 사용할 수 있는 기능
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str.substring(IntRange(0, 14)))
    println(str[0..14])
}
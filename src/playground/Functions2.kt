package playground

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int): Int {
    return x * y
}


fun main() {
    print("hello")
    printMessageWithPrefix("hello")
    printMessageWithPrefix("hello", "log")
}


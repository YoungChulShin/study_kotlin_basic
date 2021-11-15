package playground.functions.FunctionsWithVARARG

fun printAll(vararg messages: String) {
    for (m in messages) {
        println(m)
    }
}

fun printAllWithPrefix(prefix: String = "log", vararg messages: String) {
    for (m in messages) {
        println(prefix + m)
    }
}

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好"
    )
}
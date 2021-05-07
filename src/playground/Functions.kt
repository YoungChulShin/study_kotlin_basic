package playground

fun main() {
    /**
     * infix functions
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "bye ")

    val pair = "Ferrai" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    sophia likes sophia

    println(sophia)
    println(sophia.likedPeople.size)
     */

    /**
     * operator functions
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much"
    println(str[0..14])
     */

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting"
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

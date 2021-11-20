package playground.intro.functions.InfixFunctions

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "bye")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val cloudia = Person("Claudia")
    sophia likes cloudia

    println(sophia.linkedPeople[0].name)
}

class Person(val name: String) {
    val linkedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        linkedPeople.add(other)
    }
}
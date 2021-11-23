package playground.specialcase.sealedclass

sealed class Mamal(val name: String)

class Cat(val catName: String) : Mamal(catName)
class Human(val humanName: String, val job: String) : Mamal(humanName)

fun greetMammal(mammal: Mamal): String {
    return when(mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.catName}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}
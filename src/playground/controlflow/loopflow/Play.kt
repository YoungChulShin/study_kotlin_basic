package playground.controlflow.loopflow

class ForLoop {

    fun printCake() {
        val cakes = listOf("carrot", "cheese", "chocolate")
        for (cake in cakes) {                               // 1
            println("Yummy, it's a $cake cake!")
        }
    }
}

fun eatACake() = println("Eat at Cake")
fun bakeACake() = println("Bake at Cake")

fun main() {
//    val forLoop = ForLoop()
//    forLoop.printCake()

//    var cakesEaten = 0
//    var cakesBaked = 0
//    while (cakesEaten < 5) {
//        eatACake()
//        cakesEaten++
//    }
//
//    do {
//        bakeACake()
//        cakesBaked++
//    } while (cakesBaked < cakesBaked)

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}

class Animal(val name: String)
class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}
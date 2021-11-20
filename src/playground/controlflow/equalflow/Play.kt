package playground.controlflow.equalflow

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val authors2 = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println("Authors================")
    println(authors == writers)
    println(authors === writers)
    println(authors == authors2)
    println(authors === authors2)

    val name1 = "name"
    val name2 = "name"
    println("Names================")
    println(name1 == name2)
    println(name1 === name2)
    println(name1 === name1)

    val int1 = 1
    val int2 = 1
    println(int1 == int2)

    println("String" === "String")

    val building = Building("Home1")
    val building2 = Building("Home1")

    println("Building================")
    println(building == building2)
    println(building === building2)
    println(building.name == building2.name)
    println(building.name === building2.name)
}

class Building(val name: String)
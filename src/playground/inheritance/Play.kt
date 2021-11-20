package playground.inheritance

open class Dog {
    open fun sayHello() {
        println("wow wow")
    }
}

class Yokshire : Dog() {
    override fun sayHello() {
        println("wif wif")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrrr!")
    }
}

class SiberianTiger: Tiger("Siberia")

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val dog = Dog()
    val yokshire:Dog = Yokshire()

    dog.sayHello()
    yokshire.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello();

    val koreanTiger = Tiger("korea")
    koreanTiger.sayHello();

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()

}
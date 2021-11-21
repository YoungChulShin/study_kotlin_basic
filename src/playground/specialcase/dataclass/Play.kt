package playground.specialcase.dataclass

// toString 제공
// hashcode 제공
// copy 기능 제공 -> 새로운 인스턴스 생성
// componentN 기능 제공
data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
    println(user == user.copy())
    println(user === user.copy())

    println(user.copy("Max"))
    println(user.copy(id = 2))

    println(user.component1())
    println(user.component2())
}
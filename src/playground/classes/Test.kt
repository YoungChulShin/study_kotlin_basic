package playground.classes

fun main() {
    val customer = Customer()
    val contact = Contact(1, "test@gmail.com")

    println(contact.id)
    contact.email = "test2@gmail.com"
}
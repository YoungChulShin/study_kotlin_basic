package playground.functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int = ::square

fun square(x: Int) = x * x

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5, { a, b -> a * b})
    println("sumResult $sumResult, mulResult $mulResult")

    println(square(3))
    val func = operation()
    println(func(3))
}
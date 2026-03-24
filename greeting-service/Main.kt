fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")

    for (name in names) {
        println(greet(name))
    }

    // 簡単な計算
    val sum = (1..5).sum()
    println("Sum of 1 to 5: $sum")
}

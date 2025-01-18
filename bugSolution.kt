fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(newList) // Prints [1, 3, 5]
    println(list) // Prints [1, 2, 3, 4, 5] - Original list remains unchanged
}
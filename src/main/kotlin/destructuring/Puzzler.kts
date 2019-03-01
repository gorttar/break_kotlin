package destructuring

/**
 * destructuring/Puzzler.kts
 */
data class Container1(val name: String, private val items: List<Int>) : List<Int> by items

data class Container2(val name: String, internal val items: List<Int>) : List<Int> by items

val (name1, items1) = Container1("Kotlin", listOf(1, 2, 3))
println("Hello $name1, $items1")
val (name2, items2) = Container2("Kotlin", listOf(1, 2, 3))
println("Hello $name2, $items2")
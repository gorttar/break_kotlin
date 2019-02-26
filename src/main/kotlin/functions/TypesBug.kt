package functions

/**
 * functions/TypesBug.kt
 */
fun main() {
    val foo = object : () -> String, (Any) -> String {
        override fun invoke() = "foo"
        override fun invoke(p1: Any) = p1.toString()
    }
    println(foo())
    println(foo("bar"))
    println(foo is () -> String) // IDEA говорит, что проверка всегда даст true
    println(foo is (Any) -> String) // IDEA говорит, что проверка всегда даст true
}
package functions

/**
 * functions/TypesBug.kts
 */
object foo : () -> String, (Any) -> String {
    override fun invoke() = "foo"
    override fun invoke(p1: Any) = p1.toString()
}
println(foo())
println(foo("bar"))
// компилятор говорит, что проверка всегда даст true
println(foo is () -> String)
// компилятор говорит, что проверка всегда даст true
println(foo is (Any) -> String)
package casts

/**
 * casts/FluentTyping.kt
 */
fun main() {
    var foo: String?
    foo = "foo"
    foo.reversed() // умное приведение сработало

    var baz: String? = "baz"
    baz!!.reversed() // умное приведение не сработало, поэтому приходится использовать ? или !!

    baz = "baz"
    baz.reversed() // умное приведение сработало

    val bar: String?
    bar = "bar"
    bar.reversed() // умное приведение сработало

    val qaz: String? = "qaz"
    qaz!!.reversed() // умное приведение не сработало, поэтому приходится использовать ? или !!
}
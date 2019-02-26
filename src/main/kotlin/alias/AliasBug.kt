package alias

/**
 * alias/AliasBug.kt
 */
class Foo {
    companion object {
        val foo = "foo"
    }

    object Bar {
        val bar = "bar"
    }
}

typealias Baz = Foo

fun main() {
    // компилируется
    println(Foo.foo)
    println(Baz.foo)
    println(Foo.Bar.bar)
    // не компилируется с Unresolved reference: Bar
//    println(Baz.Bar.bar)
}
package alias

/**
 * alias/AliasBug.kt
 */
class Foo {
    object Bar
}

typealias Baz = Foo

fun main() {
    // компилируется
    println(Foo.Bar)
    // не компилируется с Unresolved reference: Bar
//    println(Baz.Bar)
}
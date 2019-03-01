package alias

/**
 * alias/AliasBug.kts
 */
class Foo {
    object Bar
}

typealias Baz = Foo

// компилируется
println(Foo.Bar)
// не компилируется с Unresolved reference: Bar
//println(Baz.Bar)
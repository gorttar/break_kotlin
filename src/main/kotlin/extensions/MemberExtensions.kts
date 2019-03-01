package extensions

/**
 * extensions/MemberExtensions.kts
 */
object Bar

class Foo {
    fun Bar.foo() = println("foo() called on $this@Foo and $this")
}

val foo = Foo()

with(foo) { Bar.foo() }
foo.run { Bar.foo() }
foo.(fun Foo.() = Bar.foo()) ()
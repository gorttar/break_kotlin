package etc

/**
 * etc/Labels.kt
 */
fun main() =
    with("foo") outer@{
        with("bar") inner@{
            println(this@outer)
            println(this@inner)
        }
    }
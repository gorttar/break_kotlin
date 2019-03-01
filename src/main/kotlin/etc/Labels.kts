package etc

/**
 * etc/Labels.kts
 */
with("foo") outer@{
    with("bar") inner@{
        println(this@outer)
        println(this@inner)
    }
}
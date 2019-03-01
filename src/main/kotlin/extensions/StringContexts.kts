package extensions

/**
 * extensions/StringContexts.kts
 */
class StringConcatLog(
    private val log: StringBuilder = StringBuilder()
) {
    private fun String.logPlus(element: Any?) =
        log.append(this).append(" + ").append(element).append("\n")

    // не работает. Перекрыт методом класса kotlin.String
    operator fun String.plus(tail: Any?) = logPlus(tail).let { this.plus(tail) }

    override fun toString(): String = log.toString()
}

print(
    StringConcatLog().apply {
        "foo" + "bar"
    })
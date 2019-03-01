package extensions

/**
 * extensions/Contexts.kts
 */
import kotlin.collections.Iterable
import kotlin.collections.List
import kotlin.collections.listOf
import kotlin.collections.plus as cPlus

class IterableConcatLog(
    private val log: StringBuilder = StringBuilder()
) {
    private fun Iterable<*>.logPlus(element: Any?) =
        log.append(this).append(" + ").append(element).append("\n")

    operator fun <T> Iterable<T>.plus(element: T): List<T> =
        logPlus(element).let { cPlus(element) }

    operator fun <T> Iterable<T>.plus(elements: Iterable<T>): List<T> =
        logPlus(elements).let { cPlus(elements) }

    override fun toString(): String = log.toString()
}

print(
    IterableConcatLog().apply {
        listOf(1) + 2
        listOf(1) + listOf(2)
    })
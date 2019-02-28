package casts

/**
 * casts/CollectionsBug.kt
 */
inline fun catch(
    block: () -> Unit
) =
    try {
        block()
    } catch (t: Throwable) {
        t.printStackTrace()
    }

fun main() {
    val list = listOf(1)
    catch { if (list is MutableList) list += 2 }
    val set = setOf(1)
    catch { if (set is MutableSet) set += 2 }
    val map = mapOf("foo" to 1)
    catch { if (map is MutableMap) map["bar"] = 2 }
}
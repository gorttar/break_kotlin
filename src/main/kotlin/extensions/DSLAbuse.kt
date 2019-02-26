package extensions

/**
 * extensions/DSLAbuse.kt
 */

typealias Action = () -> Unit

fun Action.glue(word: String, next: Action): Action { invoke(); print(" $word "); return next }

val Котлин = { print("Котлин") }
infix fun Action.может(в: Action) = glue("может", в)
val в = { print("в") }
infix fun Action.чистые(русские: Action) = glue("чистые", русские)
val русские = { print("русские") }
infix fun Action.слова(и: Action) = glue("слова", и)
val и = { print("и") }
infix fun Action.это(круто: Action) = glue("это", круто)
val круто = { print("круто") }
infix fun Action.не(так: Action) = glue("не", так)
val так = { print("так") }
infix fun Action.ли(`?`: Action) = glue("ли", `?`)
val `?` = { print("\b?") }
infix fun Action.Конечно(`!!!`: Action) = glue("Конечно", `!!!`).let { it() }
val `!!!` = { print("\b!!!") }

package destructuring

/**
 * destructuring/Nested.kt
 */
data class Geo(val city: String, val country: String)

data class User(val name: String, val geo: Geo)

fun main() {
    val user = User("Andrey", Geo("Samara", "Russia"))
    val (name, geo) = user;val (city, _) = geo
    // хотелось бы val (name, (city, _)) = user
    println("$name from $city")
}
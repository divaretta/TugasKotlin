fun String.hi() : String = "Hi $this"

fun String.hey() : String = "Oi $this"

fun main() {
    val name = "Diva"
    println(name.hi())
    name.hey()
    println(name.hey())

}
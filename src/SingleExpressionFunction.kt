fun float (a:Float) : Float = a * 2

fun yo (name: String) : Unit = println("Hey $name")

fun main(){
    val result = float(55.6F)
    println(result)
    yo("There")
}
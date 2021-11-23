import kotlin.math.sqrt

class Triangle(
    val side1:Double,
    val side2:Double,
    val side3:Double
) : Shape("Triangle") {

    init {
        println("$name is created with sides $side1 , $side2 and $side3")
        println("$name of area is ${perimeter()}")
        println("$name of perimeter is ${perimeter()}")
    }

    override fun area() = sqrt((perimeter()/2) * (perimeter()/2 -side1) * (perimeter()/2 - side2 ) * (perimeter()/2 - side3))
    override fun perimeter() = side1 + side2+ side3
}
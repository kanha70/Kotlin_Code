

fun main(){

    val myCircle1 = Circle(5.0)
    val rect = Rectangle(5.0)
    val triangle = Triangle(7.0,7.0,7.0)

    val maAreaRectAndCirclr = maxArea(rect,myCircle1)
    val maxAreaRectCircleTringle = maxArea(rect,myCircle1,triangle)

    println("The Maximum area of the rectangle and circle is $maAreaRectAndCirclr")
    println("The Maximum area of the rectangle ,circle and Triangle is $maxAreaRectCircleTringle")

//    myCircle1.changeName("Peter")
//    println(myCircle1.name)
//
//    val myTriangle = Triangle(3.0,3.0,3.0)
//    myTriangle.changeName("newNameof Triangle")
//    println("The name of the triangle is ${myTriangle.name}")

    }
fun maxArea(shape1: Shape,shape2: Shape) : Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}
fun maxArea(shape1: Shape,shape2: Shape, shape3: Shape) : Double{
       val maxAreaShape1Shape2 = maxArea(shape1,shape2)
       val areaShape3 = shape3.area()
       return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}

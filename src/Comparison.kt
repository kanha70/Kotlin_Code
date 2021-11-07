fun main(){
   // val x = 3
   // val y = 5
   //
   // val a = 6
   // val b = 10
   // println(x != y && a !=b)

    // && has higher precedence than || same like * > +

    val simpleExpression = 3>4 || 4>3 && 4<=4

    // println(simpleExpression)
    // OR
    // println((3>4 && 4>3) && 4>=4)

    val bool = true
    val x=9
    val y=3
    val z=9
    val hardExpression = !(x !=z) && bool || z > (x+y) && (!bool || y < z)
    println(hardExpression)

}
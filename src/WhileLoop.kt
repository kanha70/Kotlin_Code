fun main() {
    //   var x = 3
    //   while (x >0) {
    //       println("Hello!")
    //       x--
    //   }
    //       println("Hi")

    // val myArray  = arrayOf("Mango","Pomegranate","Orange")
    // val length = myArray.size
    // var i = 0
    // while (i<length){
    //     println(myArray[i])
    //     i++
    // }

    //  // Program for print all below number of entered Number
    //  println("Please Enter a small Number: ")
    //  var num = readLine()?.toInt()
    //  if (num!=null) {
    //
    //      while (num >= 0) {
    //          println(num)
    //          num--
    //      }
    //
    //  }

    //Program for finding Power

    println("Enter the two Numbers :")
    var base = readLine()?.toInt()
    var power = readLine()?.toInt()
    val initial_power = power
    var result: Long = 1

    if (base != null && power != null && base != 0 && power != 0) {
        while (power != 0) {
            result *= base.toLong()
            --power
        }
        println("result of base $base to Power $initial_power is : $result")

    } else if (power == 0) println("result of base $base to Power $initial_power is : 1")

    else println("Please Enter the Correct Formate")


}
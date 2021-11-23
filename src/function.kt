fun main(){
//    powerOf(2,5)

//    powerOf(3,5)

//    sumUntill(5)

//    val power = powerOf(2,4)
    //   println("Result of power is $power")

 //   println(multiply(2,4))

//val list = listOf(1,2,3)

 //   printFirstItem(list)

//val list = listOf(3,4,6,8,2,1,9,5,7,0)

//    println("The list looks like the following :$list")

//    println("Search for this number:")

//    val input = readLine()?.toInt()

//    if (input != null){

//        println("The index of $input is ${indexOf(list,input)}")

//    }

//    val array = intArrayOf(23,34,54,77)
//

//   val max = getMax(1,2,4,*array,5,7,3,6,12)

//    println("The maximum is $max")

//     searchFor("How to become a good programmer")

//     searchFor(search = "How to become a good kotlin programmer",searchEngine = "Bing")
     
val sum = alternatingSum(0,2,3,4,5,6,7,8)
    println("The alternating sum is $sum")
}

fun searchFor(search: String, searchEngine:String = "Google"){
    println("Searching for '$search' on $searchEngine")
}

fun getMax(vararg numbers: Int):Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}

fun indexOf(list: List<Int>, value:Int) : Int {
   for (i in 0 until list.size-1) {
       if (list[i] == value) {
           return i
       }
   }
    return -1
}

fun printFirstItem(list: List<Int>) = println(list[0])

fun multiply(a:Int,b:Int) = a*b

fun powerOf(base:Int,exponent:Int) : Int{
    var result = 1

    for (i in 1..exponent){
        result *= base
    }
    return result
}

fun sumUntill(number: Int){
      var result = 0
      for (i in 1..number){
          result += i
      }
    println("Sum of first $number number is =$result")
}

fun alternatingSum(vararg numbers: Int):Int {
     var sum = 0
    var toggle = true
    for (number in numbers){
        if (toggle == true){
            sum +=number
        } else{
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}
fun main(){
//    println("Please Enter a number")
//    val input = readLine()?.toInt()
//    if (input != null){
//        if (input.isPrime()){
//            println("$input is a prime number")
//        }else{
//            println("$input is not a prime number")
//        }
//    }
    val list = listOf(1,2,3,4,5,6)
    println("The Product of $list is ${list.product()}")

}

fun List<Int>.product(): Int{
    var result = 1
    for (value in this){
        result *= value
    }
    return result
}

//fun Int.isPrime() : Boolean{
//  for (i in 2 until this-1){
//      if (this % i == 0){
//       return false
//      }
//  }
//    return true
//}
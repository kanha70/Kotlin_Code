

fun main(){
    val list = mutableListOf(1,2,3,4)
    list.add(9)
    list.remove(4)
    println(list)

    val list1 = listOf(6,7,8,9)
    list.addAll(list1)
    println(list)

//    val map = mapOf<Int,String>(1 to "Radha New")
//    println(map.get(1))


}
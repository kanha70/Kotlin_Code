fun main(){

    println("Please Enter your Age ")
       // val userInput = readLine()
       //
       //    if (userInput != null && userInput.toInt() > 0) {
       //        if (userInput.toInt() < 18) println("You are not an adult")
       //        else if (userInput.toInt() >= 18 && userInput.toInt()<=30) println("You are an Adult")
       //        else if (userInput.toInt()> 30 && userInput.toInt()<=50 ) println("You are $userInput year old")
       //        else println("You are really really old")
       //    }

    val age = readLine()?.toInt()
    if (age != null){
        if (age>=0 && age <18) println("You are a minor")
        else if (age >=18 && age <30 ) println("You are an Adult")
        else if (age >=30 && age < 50) println("You are $age year old")
        else println("You are really old")
    }


}
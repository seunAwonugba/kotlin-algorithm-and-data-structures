//using recursion

fun factorial(number : Int) : Int{
    return if (number == 0 || number == 1){
        1
    }else{
        number * factorial(number-1)
    }
}

//using loop
fun loopFactorial(number : Int) : Double {
    var answer = 1.0
    return if(number == 0 || number == 1){
        1.0
    }else{
        for (i in 1 .. number){
            answer *= i
        }
        return answer
    }
}

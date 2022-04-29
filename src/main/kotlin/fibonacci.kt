var x1 = 0
var x2 = 1
var fibonacciArrayList = arrayListOf<Int>(x1, x2)
//var newList = fibonacciArrayList+4


fun fibonacci(number : Int) : ArrayList<Int>{
    for (i in 1..number){
        var next = fibonacciArrayList[i] + fibonacciArrayList[i - 1];
        fibonacciArrayList.add(next)
    }
    return fibonacciArrayList

}

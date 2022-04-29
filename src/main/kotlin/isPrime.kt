fun isPrime(number : Int) : String{
    return if(number in 1..3){
         "$number is prime"
    }else if(number %2 ==0 || number % 3 == 0 ){
         "$number is not prime"
    }else{
         "$number is prime"
    }
}
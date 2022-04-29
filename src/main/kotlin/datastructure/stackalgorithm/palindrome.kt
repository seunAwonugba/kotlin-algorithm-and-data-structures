package datastructure.stackalgorithm

fun palindrome(word : String) : String{
    var stack = ""
    for (i in word){
        stack = i + stack
    }
    return if (stack.toLowerCase() == word.toLowerCase()){
        "$word is a palindrome"
    }else{
        "$word is not a palindrome"
    }
}


package datastructure.stackalgorithm

class ReverseWords<T : Any>() : Stacks<T> {

    var stackArray : ArrayList<T> = arrayListOf()

    override fun push(element: T) {
        stackArray.add(element)
    }

    override fun pop(): T? {
        return if (stackArray.isEmpty()){
            null
        }else{
            stackArray.removeLast()
        }
    }
}

interface Stacks<T : Any>{
    fun push(element : T)
    fun pop() : T?
}


fun reverseWords(word : String) : String?{
    var reverseWords = ReverseWords<String>()

    return reverseWords.pop()

}




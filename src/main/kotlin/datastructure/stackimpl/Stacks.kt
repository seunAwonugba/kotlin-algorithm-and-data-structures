package datastructure

interface Stacks<T> {
    fun push(element: T) : Any
    fun pop() : T?
    fun peep() : T?
    val count : Int
    val isEmpty : Boolean

}

//Note this stack interface is different from the stack class provided by kotlin
class StacksImp<T>() : Stacks<T>{

    val  stacksContainer = arrayListOf<T>()
    private val arraySize = 4

    override fun push(element: T) : Any {
        return if (stacksContainer.size == arraySize){
            println("Stack overflow, element: $element rejected")

        }else{
            stacksContainer.add(element)
        }
    }

    override fun pop(): T? {
        return if (stacksContainer.size == 0){
            null
        }else{
            stacksContainer.removeLast()
        }
    }

    override fun peep(): T? {
        return stacksContainer.lastOrNull()
    }

    override val count: Int
        get() = stacksContainer.size
    override val isEmpty: Boolean
        get() = stacksContainer.size == 0
}


fun myStackFunction() : String{
    val stackImpl =  StacksImp<Int>()

    //add elements to the stack
    stackImpl.push(1)
    stackImpl.push(2)
    stackImpl.push(3)
    stackImpl.push(4)
    stackImpl.push(5)
    stackImpl.push(6)

//    println("Popped element : ${stackImpl.pop()}")
//
//    println("Element count : ${stackImpl.count}")
//
//    println("Last element accessed: ${stackImpl.peep()}")
//
    println("Is stack empty? : ${stackImpl.isEmpty}")

    return stackImpl.stacksContainer.toString()


}








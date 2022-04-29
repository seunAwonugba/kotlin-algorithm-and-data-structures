package datastructure.queueimpl

interface Queue<T> {
    fun enqueue(element: T) : Any
    fun dequeue() : T?
    fun peek() : T?
    val isEmpty : Boolean
    val isFull : Boolean
}

//T here is used it as string where i created an instance of the class
class QueueImpl<T>() : Queue<T>{
    val queueList = arrayListOf<T>()
    private val arraySize = 4
    override fun enqueue(element: T): Any {
        return if (queueList.size == arraySize){
            "Queue overflow"
        }else{
            queueList.add(element)
        }
    }

    override fun dequeue(): T? {
        return if (queueList.size == 0){
            null
        }else{
            queueList.removeFirst()
        }
    }

    override fun peek(): T? {
        return if (queueList.size == 0){
            null
        }else{
            queueList[0]
        }
    }

    override val isEmpty: Boolean
        get() = queueList.size == 0

    override val isFull: Boolean
        get() = queueList.size == arraySize

}

fun queueImplementation() : String{
    val queueImpl = QueueImpl<String>()

    queueImpl.enqueue("A")
    queueImpl.enqueue("B")
    queueImpl.enqueue("C")
    queueImpl.enqueue("D")
    queueImpl.enqueue("E")

    queueImpl.dequeue()

    println( queueImpl.peek())

    println(queueImpl.isFull)
    println(queueImpl.isEmpty)

    return queueImpl.queueList.toString()

}


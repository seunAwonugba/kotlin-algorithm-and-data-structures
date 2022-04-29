package datastructure.circularqueue

interface CircularQueue<T> {
    fun enqueue(element: T)

    fun dequeue() : T?

    fun peek() : T?

    val count : T?
}

class CircularQueImpl<T>(size : Int) : CircularQueue<T>{

    private val circularArrayList : Array<Int> = arrayOf(size)
    override fun enqueue(element: T) {
        TODO("Not yet implemented")
    }

    override fun dequeue(): T? {
        TODO("Not yet implemented")
    }

    override val count: T
        get() = TODO("Not yet implemented")

    override fun peek(): T? {
        TODO("Not yet implemented")
    }

}


class CQueue internal constructor() {
    var SIZE = 5 // Size of Circular Queue
    var front: Int
    var rear: Int
    var items = IntArray(SIZE)

    init {
        front = -1
        rear = -1
    }

    // Check if the queue is full
    val isFull: Boolean
        get() {
            if (front == 0 && rear == SIZE - 1) {
                return true
            }
            return front == rear + 1
        }

    // Check if the queue is empty
    val isEmpty: Boolean
        get() = front == -1

    // Adding an element
    fun enQueue(element: Int) {
        if (isFull) {
            println("Queue is full")
        } else {
            if (front == -1) front = 0
            rear = (rear + 1) % SIZE
            items[rear] = element
            println("Inserted $element")
        }
    }

    // Removing an element
    fun deQueue(): Int {
        val element: Int
        return if (isEmpty) {
            println("Queue is empty")
            -1
        } else {
            element = items[front]
            if (front == rear) {
                front = -1
                rear = -1
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % SIZE
            }
            element
        }
    }

    fun display() {
        /* Function to display status of Circular Queue */
        var i: Int
        if (isEmpty) {
            println("Empty Queue")
        } else {
            println("Front -> $front")
            println("Items -> ")
            i = front
            while (i != rear) {
                print(items[i].toString() + " ")
                i = (i + 1) % SIZE
            }
            println(items[i])
            println("Rear -> $rear")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val q = CQueue()

            // Fails because front = -1
            q.deQueue()
            q.enQueue(1)
            q.enQueue(2)
            q.enQueue(3)
            q.enQueue(4)
            q.enQueue(5)

            // Fails to enqueue because front == 0 && rear == SIZE - 1
            q.enQueue(6)
            q.display()
            val elem = q.deQueue()
            if (elem != -1) {
                println("Deleted Element is $elem")
            }
            q.display()
            q.enQueue(7)
            q.display()

            // Fails to enqueue because front == rear + 1
            q.enQueue(8)
        }
    }
}
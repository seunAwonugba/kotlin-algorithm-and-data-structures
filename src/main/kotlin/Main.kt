import datastructure.linkedlist.LinkedList
import datastructure.linkedlist.Node

fun main() {
    val a : Int = 5
    val b : Int = 10
    val c : Int = 15
    val arr = mutableListOf<Int>(5, 1, -5, 2, 10, -4, 15, 30, 11, -50, 21, -15, 12, 20, -14, 25, 31, 13,)


//    println(returnMaxNoInArray(arr))
//    println(returnMinNoInArray(arr))
//    println(returnMaxNum(a,b,c))
//
//    println(factorial(5))
//    println(loopFactorial(20))
//
//    println(isPrime(21))
//
//    println(fibonacci(10))
//
//    println(myStackFunction())
//
//    println(reverseWords("English"))
//
//    println(palindrome("Example"))

//    println(myStackFunction())
//    println(queueImplementation())

    //create nodes i.e. instance of the node class, and assign values to them
    //the default value of nextNode = null

    //in this function I have created 3 different nodes
    //and used the .nextNode property in the Node dataClass
    //to link the 2 nodes

    fun connectNodes(){
        val myNode1 = Node(value = 1)
        val myNode2 = Node(value = 2)
        val myNode3 = Node(value = 3)

        myNode1.nextNode = myNode2
        myNode2.nextNode = myNode3

        println(myNode1)
        println(myNode2)
        println(myNode3)


        //Note this is just me manually creating a linked list
        //so I created 3 nodes and did the connection my self
        //lets assume I have a million nodes to link
        //it will be so impractical for me to achieve that manually connecting them

        //the best approach to link all the million node will
        //be to use a LinkedList
    }

//    connectNodes()



//    println(myNode2)

    fun pushLinkedList() : LinkedList<Int>{
        val myLinkedList = LinkedList<Int>()


        myLinkedList.push(1)
        myLinkedList.push(2)
        myLinkedList.push(3)
        myLinkedList.push(4)
        myLinkedList.push(5)

        return myLinkedList


    }


//    println(pushLinkedList())

    fun appendLinkedList() : LinkedList<Int>{
        val myLinkedList  = LinkedList<Int>()

        myLinkedList.append(1)
        myLinkedList.append(2)
        myLinkedList.append(3)
        myLinkedList.append(4)

        return myLinkedList
    }

//    println(appendLinkedList())

    fun insertLinkedList(){
        val myLinkedList = LinkedList<Int>()

        myLinkedList.push(1)
        myLinkedList.push(2)
        myLinkedList.push(3)

        var indexToAddNewNode = myLinkedList.nodeAt(1)

        indexToAddNewNode = indexToAddNewNode?.let { myLinkedList.insert(9, it) }

        println(myLinkedList)
    }

    insertLinkedList()




}



package datastructure.linkedlist

//linked list is a linear data structure
//it includes a series of connected nodes
//each node stores DATA and ADDRESS of the next node



//the address of the first node is called HEAD
//u identify the last node in the linked list because
// the next portion points to null


//before now, we have created a
//1. Node/list
//2. We have also tried to manually link the lists or node by taking advantage of the nextNode property in a Node
//3. We found out we can for a short list, but it will be impractical for a long list

//hence, we have result to a linked list


//Note this is our linked list class,
//our linked-list class will have a head and a tail Node,
//and we can have a size

class LinkedList<T>(){
    //head refers to the first node of the list
    //tail refers to the last node of the list

    //if single node, then that single node alone has both head and tail
    private var head : Node<T>? = null
    private var tail : Node<T>? = null
    private var size = 0
    fun isEmpty() : Boolean{
        return size == 0
    }
//    fun isEmpty() : Boolean{
//        return if (size == 0){
//            true
//        }else{
//            false
//        }
//    }
//
// One of the actions u can perform on the linked list is to add elements to the linked list


//Add elements to a linked list
//we have 3 ways in which elements can be added to a linked list
//1. push() : Add element to the front of a list
//2. append() : Add element to the back of a list
//3. insert() : Add element to any point of the list

    fun push(pushedElement: T) : LinkedList<T>{
        //head first item on the list,
        //tail last item on the list

        head = Node(value = pushedElement, nextNode = head)

        if (tail == null){
            tail = head
        }
        size++

        return this


    }

    fun append(appendedElement: T) : LinkedList<T>{
        if (isEmpty()){
            push(pushedElement = appendedElement)
        }else{
            tail?.nextNode = Node(value = appendedElement)
            tail = tail?.nextNode
            size++
        }

        return this
    }


    //next way to add an element to a linked list is insert
    //it means, insert an element in this particular point of the linked list
    //to get the particular point you want to insert an item
    //create a position wrt to the node you want to insert and element @

    fun nodeAt(index : Int) : Node<T>?{
        //loop via the linked list to get the index u want to insert a new node

        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.nextNode
            currentIndex++
        }

        return currentNode
    }

    fun insert(insertedElement : T, afterNode : Node<T>) : Node<T>{
        if (tail == afterNode){
            append(appendedElement = insertedElement)
            return tail!!
        }

        val newNode = Node(value = insertedElement, nextNode = afterNode.nextNode)

        afterNode.nextNode = newNode
        size++

        return newNode

    }




    override fun toString(): String {
        return if (isEmpty()){
            "Empty list"
        }else{
            "${head.toString()} \nSize of linked list is: $size"
        }
    }



}

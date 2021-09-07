package datastructures

/*
* A singly linked list contains a reference to the node ahead of it.
* for the last node the reference is null
* */

class SinglyLinkedList<T> {
    private var size = 0

    //first node with the index 0
    private var head: Node<T>? = null

    //last node
    private var tail: Node<T>? = null


    inner class Node<T> constructor(
        internal var element: T,
        internal var next: Node<T>?
    )

    /*
    * inserting a node at the first index
    * get ref of the node
    * create a node with the element and reference from the node we get
    * make the node head*/
    fun addFirst(element: T) {
        val h = head
        val newNode = Node<T>(element, h)
        head = newNode

        //if the head has no value the list is empty, adding one element means the head = tail
        if (h == null) {
            tail = newNode
        }
        size++
    }

    /*
    * inserting a node at the last index
    * get ref of the node
    * create a node with the element and null
    * make that the tail
    * connect it to the node we got in step 1 */
    fun addLast(element: T) {
        val t = tail
        val newNode = Node<T>(element, null)
        tail = newNode

        //if the tail has no value the list is empty, adding an element means the head = tail
        if (t == null) {
            head = newNode
        } else {
            t.next = newNode
        }
    }
}
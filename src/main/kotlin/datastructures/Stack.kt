package datastructures

//only accepts adding and removing items from the front
class Stack<T> {
    private val stack = arrayListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return stack.removeAt(stack.size - 1)
    }

    fun peek(): T? {
        return stack.lastOrNull()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }
}
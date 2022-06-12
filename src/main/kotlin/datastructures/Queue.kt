package datastructures

class Queue<T> {
    private val queue = arrayListOf<T>()

    fun enqueue(item: T) {
        queue.add(item)
    }

    fun dequeue(): T? {
        return if (queue.isEmpty()) null else queue.removeAt(0)
    }

    fun isEmpty() = queue.isEmpty()
}

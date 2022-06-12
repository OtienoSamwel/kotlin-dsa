package algorithms.graph.algos

import datastructures.Queue

fun main() {
    breadthFirstSearch(graph, 'A')
}

private val graph = hashMapOf(
    'A' to listOf('C', 'B'),
    'B' to listOf('D'),
    'C' to listOf('E'),
    'D' to listOf('F'),
    'E' to listOf(),
    'F' to listOf(),
)

fun breadthFirstSearch(graph: HashMap<Char, List<Char>>, startingNode: Char) {
    val queue = Queue<Char>()
    queue.enqueue(startingNode)

    while (!queue.isEmpty()) {
        val current = queue.dequeue()
        println(current)

        graph[current]?.forEach { neighbor ->
            queue.enqueue(neighbor)
        }
    }
}

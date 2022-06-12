package algorithms.graph.examples

import datastructures.Queue

/**
 * Write a function has path that takes in an adjacency list of a directed acyclic graph and two nodes
 * (src , dst). te function should return true if there is a path from src to dst and false otherwise.
 */

val graph = mapOf(
    'F' to listOf('G', 'I'),
    'G' to listOf('H'),
    'H' to listOf(),
    'I' to listOf('G', 'K'),
    'J' to listOf('I'),
    'K' to listOf()
)

fun main() {
    println(hasPath(graph, 'F', 'K'))
    println(hasPathBfs(graph, 'F', 'K'))
}


//using dfs
fun hasPath(graph: Map<Char, List<Char>>, src: Char, dst: Char): Boolean {
    if (src == dst) return true

    graph[src]?.forEach { neighbor ->
        if (hasPath(graph, neighbor, dst)) return true
    }

    return false
}

//using bfs
fun hasPathBfs(graph: Map<Char, List<Char>>, src: Char, dst: Char): Boolean {
    if (src == dst) return true
    val queue = Queue<Char>()
    queue.enqueue(src)

    while (!queue.isEmpty()) {
        val current = queue.dequeue()
        graph[current]?.forEach { neighbor ->
            if (neighbor == dst) return true
            queue.enqueue(neighbor)
        }
    }

    return false
}
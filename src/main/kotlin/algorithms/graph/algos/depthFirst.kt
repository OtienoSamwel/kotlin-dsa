package algorithms.graph.algos


import datastructures.Stack

fun main() {
    depthFirstSearch(graph, 'E')
    println("----------------------")
    depthFirstSearchRec(graph, 'E')
}

//adjacency list
private val graph = mapOf(
    'A' to listOf('B', 'C'),
    'B' to listOf('D'),
    'C' to listOf('E'),
    'D' to listOf('F'),
    'E' to listOf(),
    'F' to listOf(),
)


//uses a stack to traverse the graph
fun depthFirstSearch(graph: Map<Char, List<Char>>, startingNode: Char) {
    val stack = Stack<Char>()
    stack.push(startingNode)

    while (!stack.isEmpty()) {
        val current = stack.pop()

        println(current)

        graph[current]?.forEach { neighbor ->
            stack.push(neighbor)
        }
    }
}

fun depthFirstSearchRec(graph: Map<Char, List<Char>>, startingNode: Char) {
    println(startingNode)

    graph[startingNode]?.forEach { neighbor ->
        depthFirstSearchRec(graph, neighbor)
    }
}




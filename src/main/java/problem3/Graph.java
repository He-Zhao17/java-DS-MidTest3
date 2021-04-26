package problem3;

import java.util.*;

/** Problem 3: Fill in the code in the method that takes a graph and returns an ArrayList
 *  of all vertex ids that have no incoming edges.
 *  Assume the graph is represented by the adjacency list.
 */
class Graph {
    Edge[] graph; // adjacency list

    class Edge {
        int neighbor;
        Edge next;
    }

    public Graph(int numVertices) {
        graph = new Edge[numVertices];
    }

    public void addEdge(int vertexId, Edge edge) {
        Edge head = graph[vertexId]; // head of the linked list for this  node
        graph[vertexId] = edge; // insert in front
        if (head != null) {
            edge.next = head;
        }
    }

    public List<Integer> verticesWithoutIncomingEdges() {
        List<Integer> result = new ArrayList<>();
        // FILL IN CODE

        return result;
    }

}


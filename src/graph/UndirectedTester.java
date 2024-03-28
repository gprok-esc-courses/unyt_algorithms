package graph;

public class UndirectedTester {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("A", "H");
        graph.addEdge("B", "E");
        graph.addEdge("B", "C");
        graph.addEdge("C", "G");
        graph.addEdge("D", "E");
        graph.addEdge("E", "G");
        graph.addEdge("E", "F");
        graph.addEdge("F", "H");
        graph.addEdge("F", "I");
        graph.addEdge("G", "I");
        graph.display();
    }
}

package graph;

public class DirectedTester {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.setDirected(true);
        graph.addVertex("s");
        graph.addVertex("t");
        graph.addVertex("y");
        graph.addVertex("z");
        graph.addVertex("x");
        graph.addEdge("s", "t", 10);
        graph.addEdge("s", "y", 5);
        graph.addEdge("t", "y", 2);
        graph.addEdge("t", "x", 1);
        graph.addEdge("y", "t", 3);
        graph.addEdge("y", "x", 9);
        graph.addEdge("y", "z", 2);
        graph.addEdge("z", "s", 7);
        graph.addEdge("z", "x", 6);
        graph.addEdge("x", "z", 4);


        graph.dijkstra("s");
        graph.display();
        graph.printShortestPath("s", "x");
    }
}

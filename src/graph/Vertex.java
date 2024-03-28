package graph;

import java.util.ArrayList;

public class Vertex {
    private String value;

    private ArrayList<Edge> edges;

    public Vertex(String value) {
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Vertex b, double weight) {
        edges.add(new Edge(b, weight));
    }

    public String getValue() {
        return value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
}

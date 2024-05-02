package graph;

import java.util.ArrayList;

public class Vertex {
    private String value;

    private ArrayList<Edge> edges;

    // These variables are for BFS
    private String color;
    private double distance;
    private Vertex parent;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }
}

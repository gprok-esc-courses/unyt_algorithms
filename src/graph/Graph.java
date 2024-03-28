package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private boolean directed;

    private HashMap<String, Vertex> vertices;

    public Graph() {
        directed = false;
        vertices = new HashMap<>();
    }

    public boolean isDirected() {
        return directed;
    }

    public void setDirected(boolean directed) {
        this.directed = directed;
    }

    public boolean addVertex(String value) {
        Vertex v = vertices.get(value);
        if(v == null) {
            v = new Vertex(value);
            vertices.put(value, v);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addEdge(String va, String vb, double weight) {
        Vertex vertexA = vertices.get(va);
        Vertex vertexB = vertices.get(vb);
        if(vertexA == null || vertexB == null) {
            return false;
        }
        else {
            vertexA.addEdge(vertexB, weight);
            if(!directed) {
                vertexB.addEdge(vertexA, weight);
            }
            return true;
        }
    }

    public boolean addEdge(String va, String vb) {
        return addEdge(va, vb, 1);
    }

    public void display() {
        for(Vertex vertex : vertices.values()) {
            System.out.print(vertex.getValue() + ", Edges: ");
            ArrayList<Edge> edges = vertex.getEdges();
            for(Edge edge : edges) {
                System.out.print("[" + edge.getDestination().getValue() + "] ");
            }
            System.out.println();
        }
    }
}

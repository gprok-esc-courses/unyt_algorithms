package graph;

import java.util.*;

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

    public void bfsInitialize() {
        for(Vertex vertex : vertices.values()) {
            vertex.setColor("white");
            vertex.setParent(null);
            vertex.setDistance(Integer.MAX_VALUE);
        }
    }

    public void bfs(String start) {
        bfsInitialize();
        Vertex startingVertex = vertices.get(start);
        Queue<Vertex> queue = new LinkedList<>();
        startingVertex.setDistance(0);
        startingVertex.setColor("gray");
        queue.add(startingVertex);
        while(!queue.isEmpty()) {
            Vertex current = queue.remove();
            ArrayList<Edge> edges = current.getEdges();
            for(Edge edge : edges) {
                if(edge.getDestination().getColor().equals("white")) {
                    edge.getDestination().setColor("gray");
                    edge.getDestination().setDistance(current.getDistance() + 1);
                    edge.getDestination().setParent(current);
                    queue.add(edge.getDestination());
                }
            }
            current.setColor("black");
        }
    }

    public void printShortestPath(String start, String destination) {
        Vertex current = vertices.get(destination);
        Vertex starting = vertices.get(start);
        if(current.getParent() == null && current != starting) {
            System.out.println("No path from " + start + " to " + destination);
            return;
        }
        if(current.getParent() != null) {
            printShortestPath(start, current.getParent().getValue());
        }
        System.out.println(destination);
    }


    public void relax(Vertex u, Vertex v, double w) {

    }

    public void initializeSingleSource(Vertex s) {

    }

    public ArrayList<Vertex> getVerticesList() {
        ArrayList<Vertex> verticesList = (ArrayList<Vertex>) vertices.values();
        return verticesList;
    }

    public void dijkstra(String start) {
        initializeSingleSource(vertices.get(start));
        ArrayList<Vertex> Q = getVerticesList();
        while(Q.size() > 0) {
            // sort and extract min (u)
            // for each edge of u (v) with weight (w)
            //      relax(u, v, w)
        }
    }
}

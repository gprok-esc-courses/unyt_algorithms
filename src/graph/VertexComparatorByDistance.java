package graph;

import java.util.Comparator;

public class VertexComparatorByDistance implements Comparator<Vertex> {
    @Override
    public int compare(Vertex o1, Vertex o2) {
        return Double.compare(o1.getDistance(), o2.getDistance());
    }
}

package com.example.demoapp1.model;

public class GraphData {
    private int vertexCount;
    private int edgeCount;
    private int source;
    private Edge[] edges;

    public int getVertexCount() {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public void setEdgeCount(int edgeCount) {
        this.edgeCount = edgeCount;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public Edge[] getEdges() {
        return edges;
    }

    public void setEdges(Edge[] edges) {
        this.edges = edges;
    }

    // Inner class Edge with its own getter and setter methods
    public static class Edge {
        private int source;
        private int destination;
        private int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public int getDestination() {
            return destination;
        }

        public void setDestination(int destination) {
            this.destination = destination;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }
}

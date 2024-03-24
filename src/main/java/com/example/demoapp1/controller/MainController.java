package com.example.demoapp1.controller;

import com.example.demoapp1.model.GraphData;
import com.example.demoapp1.model.ShortestPathResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController implements CommandLineRunner {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        // Create dummy graph data
        GraphData graphData = new GraphData();
        graphData.setVertexCount(5);
        graphData.setEdgeCount(7);
        graphData.setSource(0);
        // Define edges
        GraphData.Edge[] edges = new GraphData.Edge[]{
                new GraphData.Edge(0, 1, 6),
                new GraphData.Edge(0, 2, 7),
                new GraphData.Edge(1, 3, 5),
                new GraphData.Edge(1, 2, 8),
                new GraphData.Edge(1, 4, -4),
                new GraphData.Edge(2, 3, -3),
                new GraphData.Edge(2, 4, 9)
        };
        graphData.setEdges(edges);

        // Call the Bellman-Ford API
        ResponseEntity<ShortestPathResult> responseEntity = restTemplate.postForEntity("http://localhost:8080/shortest-path", graphData, ShortestPathResult.class);
        ShortestPathResult result = responseEntity.getBody();

        // Print the result
        System.out.println("Shortest Path: " + result.getPath());
        System.out.println("Total Distance: " + result.getDistance());
    }
}

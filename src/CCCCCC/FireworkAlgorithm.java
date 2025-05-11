package CCCCCC;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2023/2/27 - 16:28
 * @Description:
 * @version: 1.0
 */

public class FireworkAlgorithm {

    // function that implements firework algorithm
    public void fireworkAlgorithm(int[][] adjacencyMatrix, int n) {
        // Create dist[] array and visit[] array
        int dist[] = new int[n];
        boolean visit[] = new boolean[n];

        // Initialize distance of each node from itself as 0
        for (int i=0; i<n; ++i)
            dist[i] = Integer.MAX_VALUE;
        dist[0] = 0;

        // Iterate through all nodes
        int u;
        while ((u = minDistance(dist, visit)) != Integer.MAX_VALUE) {
            visit[u] = true;

            // Iterate through all neighbors of u to update their distances
            for (int v=0; v<n; ++v) {
                // Update dist[v] only if it is not visited and total
                // weight of path from u to v is smaller than current value of dist[v]
                if (!visit[v] && adjacencyMatrix[u][v]!=0 && dist[u] + adjacencyMatrix[u][v] < dist[v])
                    dist[v] = dist[u] + adjacencyMatrix[u][v];
            }
        }

        // Print the shortest distance from source node to all other nodes
        for (int i=1; i<n; ++i)
            System.out.println("The shortest distance from source node to " +
                    i + " : " + dist[i]);
    }

    // Function to find the node with minimum distance value which is not yet visited
    private int minDistance(int[] dist, boolean[] visit) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i=0; i<dist.length; ++i) {
            if (visit[i] == false && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    // main method
    public static void main (String[] args) {
        int n = 5;
        int[][] adjacencyMatrix = {{0, 2, 6, 4, 5},
                {2, 0, 3, 8, 7},
                {6, 3, 0, 1, 9},
                {4, 8, 1, 0, 10},
                {5, 7, 9, 10, 0}};
        FireworkAlgorithm fwa = new FireworkAlgorithm();
        fwa.fireworkAlgorithm(adjacencyMatrix, n);
    }
}

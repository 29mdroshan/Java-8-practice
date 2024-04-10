package com.java.shortpath;

public class ShortestPath {

	    int minDistance(int dist[], Boolean processed[])
	    {
	        int min = Integer.MAX_VALUE, min_index = -1;
	        for (int i = 0; i < dist.length; i++)
	            if (processed[i] == false && dist[i] <= min) {
	                min = dist[i];
	                min_index = i;
	            }
	  
	        return min_index;
	    }
	  
	    void dijkstra(int graph[][], int src)
	    {
	    	int n=graph.length;
	        int dist[] = new int[n]; 
	        Boolean processed[] = new Boolean[n];
	        
	        if(src>n) {
	        	System.out.println("Value out of boundary");
	        	System.exit(n);
	        }
	        
	        for (int i = 0; i < n; i++) {
	            dist[i] = Integer.MAX_VALUE;
	            processed[i] = false;
	        }
	  
	        dist[src] = 0;
	  
	        for (int i = 0; i < n - 1; i++) {
	            int u = minDistance(dist, processed);
	 
	            processed[u] = true;
	            for (int v = 0; v < n; v++)
	                if (!processed[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
	                    dist[v] = dist[u] + graph[u][v];
	        }
	  
	        for(int i=0;i<n;i++){
	        	System.out.println(i+"\t"+dist[i]);
	        }
	        
	    }
	  
	    public static void main(String[] args)
	    {
	        int graph[][]
	            = new int[][] { {0, 1, 4, 0, 0, 0},
					{1, 0, 4, 2, 7, 0},
					{4, 4, 0, 3, 5, 0},
					{0, 2, 3, 0, 4, 6},
					{0, 7, 5, 4, 0, 7},
					{0, 0, 0, 6, 7, 0} };
	        ShortestPath t = new ShortestPath();	
	        t.dijkstra(graph, 9);
	    }
	
}

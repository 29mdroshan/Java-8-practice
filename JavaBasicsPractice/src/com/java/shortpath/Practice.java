package com.java.shortpath;

import java.util.Arrays;

public class Practice {

	int minivalue(int[] distance, Boolean[] processed) {

		int min=Integer.MAX_VALUE, mini_index=-1;
		for(int i=0;i<distance.length;i++) {
			if(processed[i]== false && distance[i]<=min) {
				min=distance[i];
				mini_index=i;
			}
		}
		
		return mini_index;
	}

	void dijkstra(int[][] graph, int src) {
		int n = graph.length;

		int[] distance = new int[n];
		Boolean[] processed = new Boolean[n];

		if (src > n || src < 0) {
			System.out.println("Value out of bound");
			System.exit(n);
		}

		for (int i = 0; i < n; i++) {
			distance[i] = Integer.MAX_VALUE;
			processed[i] = false;
		}
		
		distance[src]=0;

		for (int i = 0; i < n-1; i++) {
			int u = minivalue(distance, processed);
			processed[u]=true;
			for(int v=0;v<n;v++) {
				if(!processed[v] && graph[u][v]!=0 && distance[u]!=Integer.MAX_VALUE && distance[u]+graph[u][v]<distance[v])
					distance[v]=distance[u]+graph[u][v];
			}

		}
		
		for(int i=0;i<n;i++)
			System.out.println(i+"\t"+distance[i]);

	}
	
	public static void main(String[] args) {
		int graph[][]
	            = {{2,1,1},{2,3,1},{3,4,1}};
		int graph2[][]=new int[4][4];
			for(var v:graph) {
				graph2[v[0]-1][v[1]-1]=v[2];
			}
			
			for(var v:graph2) {
				System.out.println(Arrays.toString(v));
			}
	            
	            
	}

}

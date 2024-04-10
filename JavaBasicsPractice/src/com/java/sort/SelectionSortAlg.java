package com.java.sort;

import java.util.Arrays;

public class SelectionSortAlg {
	
	
	public void selectionSort(int[] arr) {
		
		int n=arr.length,min;
		
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;

		}
	}
	
	public static void main(String[] args) {
		SelectionSortAlg ss=new SelectionSortAlg();
		int[] arr = { 40, 20, 30, 10, 80, 5};
		ss.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

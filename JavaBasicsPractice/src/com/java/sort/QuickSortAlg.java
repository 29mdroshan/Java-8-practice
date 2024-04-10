package com.java.sort;

public class QuickSortAlg {
	
	public void swap(int[] arr, int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public int partition(int[] arr, int low, int high) {
		int pivot=arr[low],i=low,j=high;
		
		while(i<j) {
			while(arr[i]<=pivot)i++;
			
			while(arr[j]>pivot)j--;
			
			if(i<j) 
				swap(arr,i,j);
				
		}
		
		swap(arr,j,low);
		
		return j;
		
	}
	
	public void quickSort(int[] arr,int low, int high) {
		if(low<high) {
			int pivot=partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 40, 20, 30, 10, 80, 5};
		
		QuickSortAlg qs=new QuickSortAlg();
		qs.quickSort(arr, 0, arr.length-1);
		
		for(var v:arr) {
			System.out.println(v);
		}
	}
}

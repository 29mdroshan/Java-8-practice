package com.java.search;
 
public class BinarySearch {
	
	int mid;
	public int algorithm(int[] arr,int low , int high, int key) {
		if(high>=low) {
			
			mid=(low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				return algorithm(arr,low,mid-1,key);
			else
				return algorithm(arr,mid+1,high,key);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,40,50,60};
		BinarySearch bs=new BinarySearch();
		
		int flag=bs.algorithm(arr, 0, arr.length-1,60);
		if(flag!=-1) {
			System.out.println("Element present at index : "+flag);
		}
		else {
			System.out.println("Element is not present in the given array ");
		}
		
	}

}

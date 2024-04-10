package com.java.practice;

public class SerachPractice {
	
	
	public int linearSearch(int[] arr,int key) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	
	public int binarySearch(int[] arr,int low,int high, int key) {
		if(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				return binarySearch(arr, low, mid, key);
			else
				return binarySearch(arr, mid+1, high, key);
			
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
//		int[] arr= {10,20,65,30,70,50};
//		SerachPractice ls=new SerachPractice();
//		int flag=ls.linearSearch(arr, 50);
		
		
		int[] arr= {10,25,30,45,50,60,80};
		SerachPractice bs=new SerachPractice();
		int flag=bs.binarySearch(arr, 0, arr.length-1, 60);
		
		if(flag!=-1)
			System.out.println("Element Present at index : "+flag);
		else
			System.out.println("Element is not present in given array!");
		
	}

}

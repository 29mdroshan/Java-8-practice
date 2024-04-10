package com.java.search;


public class LinearSearch {
	public int linearSearch(int[] arr,int key) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,65,30,70,50};
		
		LinearSearch ls=new LinearSearch();
		int flag=ls.linearSearch(arr, 50);
		
		if(flag!=-1)
			System.out.println("Element Present at index : "+flag);
		else
			System.out.println("Element is not present in given array!");
		
	}
}

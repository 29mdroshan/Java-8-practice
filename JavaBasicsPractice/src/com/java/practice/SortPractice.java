package com.java.practice;

import java.util.Arrays;

public class SortPractice {
	
	public void selectionSort(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public int partition(int[] arr, int low, int high) {
		int pivot=arr[high],i=low,j=high;
		
		while(i<j) {
			while(arr[i]<=pivot)i++;
			while(arr[j]>pivot)j--;
			
			if(i<j) {
				swap(arr,i,j);
			}
		}
		swap(arr,low,j);
		return j;
		
	}
	
	
	


	public void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}
	


	public void merge(int[] arr, int low, int mid, int high) {
		
		int[] temp=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) 
				temp[k++]=arr[i++];
			else 
				temp[k++]=arr[j++];	
		}
		
		while(i<=mid) 
			temp[k++]=arr[i++];
				
		while(j<=high) 
			temp[k++]=arr[j++];
				
		for(int z=0,y=low;z<temp.length;z++,y++)
			arr[y]=temp[z];
		
	}

	
	public void mergeSort(int[] arr, int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid,high);
		}
	}
	
	

	public void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 40, 20, 30, 10, 80,7 };
		
		//Selection Sort
		SortPractice ss=new SortPractice();
		ss.selectionSort(arr);
		
		//Bubble Sort
//		SortPractice bs=new SortPractice();
//		bs.bubbleSort(arr);
		
		//MergeSort
//		SortPractice ms=new SortPractice();
//		ms.mergeSort(arr, 0, arr.length-1);
		
		//QuickSort
//		SortPractice qs=new SortPractice();
//		qs.quickSort(arr, 0, arr.length-1);
		
		
		
		System.out.println(Arrays.toString(arr));
	}

}

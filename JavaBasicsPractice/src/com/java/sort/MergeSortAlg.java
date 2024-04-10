package com.java.sort;

public class MergeSortAlg {
	
	public void merge(int[] arr,int low,int mid,int high) {
		int[] temp=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;k++;
			}
			else {
				temp[k]=arr[j];
				j++;k++;
			}
		}
		while(i<=mid) {
			temp[k]=arr[i];
			i++;k++;
		}
		while(j<=high) {
			temp[k]=arr[j];
			j++;k++;
		}
		
		for(int z=0,y=low;z<temp.length;z++,y++) {
			arr[y]=temp[z];
		}
		
		
	}
	
	public void mergeSort(int[] arr,int low,int high){
		if(low<high) {
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
		
	}

	
	public static void main(String[] args) {
		int[] arr = { 40, 20, 30, 10, 80, 50 };

		MergeSortAlg ms = new MergeSortAlg();
		ms.mergeSort(arr,0,arr.length-1);
		for (var v:arr) {
			System.out.println(v);
		}
	}

}

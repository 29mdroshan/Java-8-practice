package com.java.sort;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

            InsertionSort is = new InsertionSort();
            int[] arr = {7,5,9,3,4,6,2,8};
            int[] result = is.insertionSort(arr);
            for(int i :result) {
                System.out.println(i);
            }
        }
}

package com.dsa;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {10, 34, 23, 77, 12, 89, 13};
        int elementToSearch = 77;
        System.out.println(search(arr, elementToSearch));
    }

    private static boolean search(int[] arr, int key) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key) {
                return true;
            }
        }
        return false;
    }

}



/*
      Created By : Mahesh Raturi
 */

public class ArrayDSA {

    int arr[];
    int size;

    public ArrayDSA(int[] arr){
        this.arr = arr;
        this.size = arr.length;
    }

    //assuming array is not empty here
    public int largestElementInAnArray() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    //assuming arr has both positive and negative values
    public int secondLargestElementInAnArray() {
        int secondLargest = Integer.MIN_VALUE;
        if (arr.length != 0) {
            int largest = arr[0];
            for (int i = 1; i < size; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = -1;
        }
        return secondLargest;
    }

    public boolean checkIfArraySorted(){
        for(int i = 1;i < size ; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public void printArray(){
        for(int i = 0;i < size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void reverseAnArray(){
        int i = 0, j = size-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }

    public void removeDuplicatesFromArray(){
        if(size > 1) {
            int i = 0;
            for(int j = 1;j<size;j++){
                if(arr[j] != arr[i]){
                    i = i+1;
                    arr[i] = arr[j];
                }
            }
        }
    }



}

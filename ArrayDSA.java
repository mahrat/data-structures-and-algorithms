

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

}

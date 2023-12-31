import java.util.Scanner;

public class Main {

    public static int[] takeArrayInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter arr: ");
        for(int i = 0;i < size;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void arrayOperations() {
        int[] arr = takeArrayInput();
        ArrayDSA arrayDSA = new ArrayDSA(arr);
        System.out.println(arrayDSA.largestElementInAnArray());
        System.out.println(arrayDSA.secondLargestElementInAnArray());
        System.out.println(arrayDSA.checkIfArraySorted());
        arrayDSA.reverseAnArray();
        arrayDSA.printArray();
        arrayDSA.removeDuplicatesFromArray();
        arrayDSA.printArray();
    }

    public static void linkedListOperations() {
        LinkedListDSA linkedListDSA = new LinkedListDSA();
    }

    public static void main(String[] args) {
        arrayOperations();
        linkedListOperations();
    }

}

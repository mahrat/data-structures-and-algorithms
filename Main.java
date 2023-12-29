public class Main {

    public static void arrayOperations() {
        int[] arr = {3, 5, 15, 18, 7, 9, 19, 11};
        ArrayDSA arrayDSA = new ArrayDSA(arr);
        System.out.println(arrayDSA.largestElementInAnArray());
        System.out.println(arrayDSA.secondLargestElementInAnArray());
    }

    public static void linkedListOperations() {
        LinkedListDSA linkedListDSA = new LinkedListDSA();
    }

    public static void main(String[] args) {
        arrayOperations();
        linkedListOperations();
    }

}

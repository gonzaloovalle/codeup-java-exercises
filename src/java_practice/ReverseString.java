package java_practice;

public class ReverseString {
    static void reverseArr(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    static void printArr(int arr[], int size) {
            for (int i=0;i<size;i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArr(arr, 6);
        reverseArr(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArr(arr, 6);

    }
}

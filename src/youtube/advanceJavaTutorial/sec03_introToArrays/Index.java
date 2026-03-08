package youtube.advanceJavaTutorial.sec03_introToArrays;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        int arr[] = new int[5];

        System.out.println("Enter the elements of the array in asceding order: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the elements you want to search for: ");
        int num = input.nextInt();
        int n = arr.length;
        int result = ob.binarySearch(arr, 0, n-1, num);

        if (result==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element "+num+" found at index "+result);
    }
}

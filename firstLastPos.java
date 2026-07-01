package Array;

import java.util.Scanner;

public class firstLastPos {

    public static int[] firstLast(int[] arr, int target) {

        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {              
                    first = i;
                    break;
            }
        }
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == target) {              
                    last = i;
                    break;
            }
        }
        return new int[] {first, last};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int[] result = firstLast(arr, target);
        System.out.println("{" + result[0] + ", " + result[1] + "}");

    }
}
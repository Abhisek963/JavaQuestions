package Array;

import java.util.Scanner;

public class countAvgArray {
    public static int AvgSub(int[] arr) {
        int count = 0;
        int k = 3;
        int x = 2;
        for (int i = 0; i <= arr.length - k; i++) {
            float sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            float avg = sum / k;
            if (avg > x) {
                count++;
           }
        }
        return count;
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
        int result = AvgSub(arr);
        System.out.println("Count = " + result);

    }
}
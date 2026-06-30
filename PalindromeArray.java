package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray{
    
    public static boolean palindrome(int[] arr) {
    	int i = 0;
    	int j= arr.length - 1;
    	while(i<j) {
    		if(arr[i] != arr[j]) 
    			return false;
    		i++;j--;
    		}
    		return true;
    	}
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array elements are:"+ Arrays.toString(arr));
        System.out.println(palindrome(arr));
        
    }
}

package task;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value of elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        System.out.println("arr = " + Arrays.toString(arr));
    }
    
}
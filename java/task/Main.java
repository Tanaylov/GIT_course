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
        removeEvenNumbers(arr);
    }

    /**
     * @apiNote функция принимает произвольный список целых чисел, на основе его создает список нечётных чисел и выводит его на экран.
     * @param array
     */
    public static void removeEvenNumbers(int[] array){
        int count = 0;
        for (int el : array) {
            if (el % 2 == 0) count += 1;
        }
        if (count == 0) System.out.println("array = " + Arrays.toString(array));
        else{
            int[] newArr = new int[array.length - count];
            int i2 = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0){
                    newArr[i2] = array[i];
                    i2 += 1;
                }
            }
            System.out.println("newArr = " + Arrays.toString(newArr));
        }

    }
    
}
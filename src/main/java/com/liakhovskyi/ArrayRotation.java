package com.liakhovskyi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Insert array values:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter how many first elements you want to move: ");
        int k = input.nextInt();

        int[] rotatedArray = rotate(array, k);

        System.out.println("Array before rotation: " + Arrays.toString(array));
        System.out.println("Array after rotation: " + Arrays.toString(rotatedArray));
    }

    public static int[] rotate(int[] array, int k) {
        int[] copied = Arrays.copyOf(array, array.length);

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < copied.length - 1; j++) {
                int temp = copied[j];
                copied[j] = copied[j + 1];
                copied[j + 1] = temp;
            }
        }
        return copied;
    }
}
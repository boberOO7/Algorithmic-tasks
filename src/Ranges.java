import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;


public class Ranges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array values:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.println("Ranges of array: " + ranging(array));
    }

    public static StringBuilder ranging(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        StringBuilder result = new StringBuilder();
        int k = 0;
        for (int i = 0; i < copiedArray.length - 1; i++) {
            if (copiedArray[i] == copiedArray[i + 1] - 1) {
                k++;
            } else if (k > 0) {
                longRange(result, i, k, copiedArray);
                k = 0;
            } else if (k == 0) {
                shortRange(result, i, k, copiedArray);
            }
            if (i == copiedArray.length - 2 && k > 0) {
                longRange(result, i + 1, k, copiedArray);
            } else if (i == copiedArray.length - 2 && k == 0) {
                shortRange(result, i + 1, k, copiedArray);
            }
        }
        return result;
    }

    public static void longRange(StringBuilder result, int i, int k, int[] copiedArray){
        result.append("[" + String.valueOf(copiedArray[i - k]) + " " + String.valueOf(copiedArray[i]) + "]");
    }

    public static void shortRange(StringBuilder result, int i, int k, int[] copiedArray){
        result.append("[" + String.valueOf(copiedArray[i]) + "]");
    }
}

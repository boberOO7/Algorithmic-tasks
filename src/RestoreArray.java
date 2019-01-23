import java.util.Arrays;
import java.util.Scanner;

public class RestoreArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array values:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int[] resoredArray = restoring(array);
        System.out.println("Array before restore: " + Arrays.toString(array));
        System.out.println("Array after restore: " + Arrays.toString(resoredArray));
    }

    public static int[] restoring(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] < 0) {
                copiedArray[i] = (copiedArray[i + 1] + copiedArray[i - 1]) / 2;
            }
        }
        return copiedArray;
    }
}
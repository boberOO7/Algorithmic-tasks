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
        int[] copied = restoring(array);
        System.out.println("Array before restore: " + Arrays.toString(array));
        System.out.println("Array after restore: " + Arrays.toString(copied));
    }

    public static int[] restoring(int[] array) {
        int[] copied = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copied.length; i++) {
            if (copied[i] < 0) {
                ////////////// inc
                if ((i > 1) && (copied[i - 2] + 1 == copied[i - 1])) { // **x
                    copied[i] = copied[i - 1] + 1;
                } else if ((i < copied.length - 2) && (copied[i + 1] == copied[i + 2] - 1)) { // x**
                    copied[i] = copied[i + 1] - 1;
                } else if ((i > 0) && (i < copied.length - 1) && (copied[i - 1] + 1 == copied[i + 1] - 1)) { // *x*
                    copied[i] = copied[i - 1] + 1;
                }
                ////////////// dec
                else if ((i > 1) && (copied[i - 2] - 1 == copied[i - 1])) { // **x
                    copied[i] = copied[i - 1] - 1;
                } else if ((i < copied.length - 2) && (copied[i + 1] == copied[i + 2] + 1)) { // x**
                    copied[i] = copied[i + 1] + 1;
                } else if ((i > 0) && (i < copied.length - 1) && (copied[i - 1] - 1 == copied[i + 1] + 1)) { // *x*
                    copied[i] = copied[i - 1] - 1;
                } else {
                    System.out.println("I can't restore this array ☺");
                    break;
                }
            }
        }
        return copied;
    }
}
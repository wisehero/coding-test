package skill.sort;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 1, 2};
        sortV1(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sortV1(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortV2(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {

            boolean swapped = false;

            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
